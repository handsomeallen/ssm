package com.ssm.demo.controller;

import org.apache.shiro.web.servlet.SimpleCookie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static sun.java2d.cmm.ColorTransform.In;

/**
 * Created by allen.yao on 2016/7/1.
 */
@Controller
public class Index {
    @RequestMapping("/")
    public  String login(){
        return "index";
    }

}
