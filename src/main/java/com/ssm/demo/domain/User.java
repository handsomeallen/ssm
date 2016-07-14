package com.ssm.demo.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by allen.yao on 2016/6/30.
 */
@Table(name="user")
public class User {
    private long id;

    private String userName;

    private String passWd;

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWd='" + passWd + '\'' +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }
}
