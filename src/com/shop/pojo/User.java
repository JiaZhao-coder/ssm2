package com.shop.pojo;

import java.util.Date;

public class User {
    private Long userId;

    private String userName;

    private String userSex;

    private String userAddress;

    private Date userCreatetime;

    private Date userUpdatetime;

    private Boolean userLogicdelete;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Date getUserCreatetime() {
        return userCreatetime;
    }

    public void setUserCreatetime(Date userCreatetime) {
        this.userCreatetime = userCreatetime;
    }

    public Date getUserUpdatetime() {
        return userUpdatetime;
    }

    public void setUserUpdatetime(Date userUpdatetime) {
        this.userUpdatetime = userUpdatetime;
    }

    public Boolean getUserLogicdelete() {
        return userLogicdelete;
    }

    public void setUserLogicdelete(Boolean userLogicdelete) {
        this.userLogicdelete = userLogicdelete;
    }
}