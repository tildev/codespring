/**
 * 
 */
package com.tildev.web.domain;

import java.util.Date;

/**
 * @author tildev
 * @date 2019. 4. 16.
 */
public class UserInfoVO {
    private String userId;

    private String userPw;

    private String userName;

    private String userEmail;

    private Date createdAt;

    private Date updatedAt;

    public UserInfoVO() {
        super();
    }

    /**
     * @param userId
     * @param userPw
     * @param userName
     * @param userEmail
     * @param createdAt
     * @param updatedAt
     */
    public UserInfoVO(String userId, String userPw, String userName, String userEmail, Date createdAt, Date updatedAt) {
        super();
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.userEmail = userEmail;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the userPw
     */
    public String getUserPw() {
        return userPw;
    }

    /**
     * @param userPw the userPw to set
     */
    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * @param userEmail the userEmail to set
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * @return the createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt the updatedAt to set
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "UserInfoVO [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userEmail="
                + userEmail + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
    }

}
