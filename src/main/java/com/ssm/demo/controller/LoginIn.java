package com.ssm.demo.controller;

import com.ssm.demo.domain.User;
import com.ssm.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by allen.yao on 2016/7/1.
 */
@Controller
public class LoginIn {
    @Autowired
    private UserService userService;


    @RequestMapping("/loginIn")
    public  String login(@ModelAttribute("user")User user){
        User user1 = userService.login(user.getUserName(), user.getPassWd());
        if (user1==null)
        return "loginErro";
        else return "loginSuccess";
    }




}
