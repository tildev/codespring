/**
 * 
 */
package com.tildev.web.dao;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.tildev.web.domain.UserInfoVO;

/**
 * @author tildev
 * @date 2019. 4. 16.
 */
@Repository
public class UserInfoDAOImpl implements UserInfoDAO {

    @Inject
    private SqlSession sqlSession;

    private static final String namespace = "com.tildev.mapper.UserInfoMapper";

    @Override
    public String getTime() {
        return sqlSession.selectOne(namespace + ".getTime");
    }

    @Override
    public void insertUserInfo(UserInfoVO userInfo) {
        sqlSession.insert(namespace + ".insertUserInfo", userInfo);
    }

    @Override
    public UserInfoVO readUserInfo(String userId) throws Exception {
        return (UserInfoVO) sqlSession.selectOne(namespace + ".selectUserInfo", userId);
    }

    @Override
    public UserInfoVO readWithPw(String userId, String userPw) throws Exception {
        Map<String, Object> paramMap = new HashMap<String, Object>();

        paramMap.put("userId", userId);
        paramMap.put("userPw", userPw);

        return sqlSession.selectOne(namespace + ".readWithPw", paramMap);
    }

}
