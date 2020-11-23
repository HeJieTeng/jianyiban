package com.io.jyb.sys.controller;


import com.io.jyb.sys.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserServiceImpl userService;

    /**
     * 查询用户列表
     * @return
     */
    @RequestMapping("getUsersList")
    @ResponseBody
    public Map<String,Object> getUsers(){
        Map<String,Object> userMap = new HashMap<>();
        userMap.put("users",userService.getUsers());
        userMap.put("code", HttpStatus.OK.value());
        return userMap;
    }


//    @RequestMapping("getUserRoleList")
//    @ResponseBody
//    public Map<String,Object> getUserRoleList(){
//        Map<String,Object> userMap = new HashMap<>();
//        userMap.put("usersrole",userService.queryUserRoleList());
//        userMap.put("code", HttpStatus.OK.value());
//        return userMap;
//    }




}
