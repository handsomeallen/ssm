package com.jinjiang.ssm.controller;

import com.jinjiang.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by allen.yao on 2016/7/8.
 */

@Controller
public class TransactionalTest {

    @Autowired
    private UserService userService;

    @RequestMapping("/transactional")

    public String test(@RequestParam("id")long id){
        userService.update(id);
        System.out.printf("更新成功");
        userService.login(id);
        return null;

    }


}
