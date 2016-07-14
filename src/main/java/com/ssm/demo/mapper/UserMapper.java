package com.ssm.demo.mapper;

import com.ssm.demo.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by allen.yao on 2016/6/30.
 */
public interface UserMapper {


    User login(@Param("userName") String userName, @Param("passwd") String passwd);
}
