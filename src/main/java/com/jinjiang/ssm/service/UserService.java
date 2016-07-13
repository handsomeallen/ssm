package com.jinjiang.ssm.service;

import com.jinjiang.ssm.domain.User;

/**
 * Created by allen.yao on 2016/6/30.
 */
public interface UserService {
    User login(long id);

    int update(long id);
}
