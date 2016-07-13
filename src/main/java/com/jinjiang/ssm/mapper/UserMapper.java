package com.jinjiang.ssm.mapper;

import com.jinjiang.ssm.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by allen.yao on 2016/6/30.
 */
public interface UserMapper {


    User login(@Param("id") long id);
    int update(@Param("id") long id);
}
