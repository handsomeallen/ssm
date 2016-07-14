package com.ssm.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by allen.yao on 2016/7/13.
 */
@Controller
public class Login {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
