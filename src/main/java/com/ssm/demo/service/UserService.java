package com.ssm.demo.service;

import com.ssm.demo.domain.User;

/**
 * Created by allen.yao on 2016/6/30.
 */
public interface UserService {
    User login(String userName, String passwd);

}
