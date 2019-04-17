/**
 * 
 */
package com.tildev.web.dao;

import com.tildev.web.domain.UserInfoVO;

/**
 * @author tildev
 * @date 2019. 4. 16.
 */
public interface UserInfoDAO {

    public String getTime();

    public void insertUserInfo(UserInfoVO userInfo);

    public UserInfoVO readUserInfo(String userId) throws Exception;
    
    public UserInfoVO readWithPw(String userId, String userPw) throws Exception;
}
