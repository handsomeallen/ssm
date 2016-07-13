package com.jinjiang.ssm.serviceImpl;

import com.jinjiang.ssm.domain.User;
import com.jinjiang.ssm.mapper.UserMapper;
import com.jinjiang.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * Created by allen.yao on 2016/6/30.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User login(long id) {
        return userMapper.login(id);
    }

    @Transactional
    public int update(long id) {
        User user2 = userMapper.login(id);
        userMapper.update(id);
        User user = userMapper.login(id);
        System.out.println(user);
        int [] i={1,2,3};
        int i1 = i[4];
        return 0;


    }


}
