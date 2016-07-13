package com.jinjiang.ssm.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by allen.yao on 2016/6/30.
 */
@Table(name="user")
@Getter
@Setter
public class User {
    @Column(name = "id")
    private long id;

    private String userName;

    private String passWd;


}
