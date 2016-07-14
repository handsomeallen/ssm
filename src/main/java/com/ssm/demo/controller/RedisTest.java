package com.ssm.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by allen.yao on 2016/7/14.
 */

@Controller
public class RedisTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/redis")
    public String index() throws Exception {
        redisTemplate.opsForValue().set("name","allen");
        return "redis";
    }
}
