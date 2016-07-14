package com.ssm.demo.serviceImpl;

import com.ssm.demo.domain.User;
import com.ssm.demo.mapper.UserMapper;
import com.ssm.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by allen.yao on 2016/6/30.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User login(String userName,String passwd) {
        return userMapper.login(userName,passwd);
    }




}
