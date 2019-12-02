package com.caplight.android.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.caplight.android.entity.User;
import com.caplight.android.service.UserService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2019-11-19 15:26:28
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public int findByNameAndPass(@RequestBody String data){
       try {
           JSONObject jsonObject=new JSONObject();
           jsonObject.getJSONObject(data);
           User user=new User();
           user.setUsername(jsonObject.getString("username"));
           user.setPassword(jsonObject.getString("password"));
           userService.findByNameAndPass(user);
       }catch (Exception e){
           e.printStackTrace();
       }
        return 1;
    }

    @RequestMapping("/findAll")
    public User findAll(){
        return userService.findAll();
    }
}