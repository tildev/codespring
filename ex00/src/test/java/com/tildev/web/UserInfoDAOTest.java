/**
 * 
 */
package com.tildev.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tildev.web.dao.UserInfoDAO;
import com.tildev.web.domain.UserInfoVO;

/**
 * @author tildev
 * @date 2019. 4. 16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class UserInfoDAOTest {

    @Inject
    private UserInfoDAO userInfoDao;

    @Test
    public void testTime() throws Exception {
        System.out.println(userInfoDao.getTime());
    }

    @Test
    public void testInsertUserInfo() throws Exception {
        UserInfoVO userInfo = new UserInfoVO();
        userInfo.setUserId("user00Id");
        userInfo.setUserPw("user00Pw");
        userInfo.setUserName("user00Name");
        userInfo.setUserEmail("user00@aaa.com");

        userInfoDao.insertUserInfo(userInfo);
    }
}
