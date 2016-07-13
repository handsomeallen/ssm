package com.jinjiang.ssm.controller;

import com.jinjiang.ssm.domain.User;
import com.jinjiang.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;

import static com.sun.org.apache.xml.internal.serialize.LineSeparator.Web;
import static javafx.scene.input.KeyCode.Y;

/**
 * Created by allen.yao on 2016/7/1.
 */
@Controller
public class LoginIn {
    @Autowired
    private UserService userService;

    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("/loginIn")
    public  String login(@ModelAttribute("user")User user, HttpServletRequest request, HttpServletResponse response,ModelMap model){
        model.put("name","aaa");
        return "loginErro";
    }


@RequestMapping("/")
    public String index(){
        return "sb";
    }
    @RequestMapping("/image")
    public String index(@RequestParam("image")MultipartFile file) throws Exception {
            redisTemplate.opsForValue().set("name","allen");
        return "sb";
    }
}
