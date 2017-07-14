package com.example.fuzhihuangcom.androidbasedemo.bean序列化示例;

import java.io.Serializable;

/**
 * Created by fuzhihuang on 2017/7/14.
 * Serializable序列化接口
 */

public class User implements Serializable {
    private static final long serialVersionUID = 123456L;
    public int userId;
    public String userName;
    public boolean isMale;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
