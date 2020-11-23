package com.io.jyb.sys.controller;

import com.io.jyb.sys.services.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleServiceImpl roleService;


    @RequestMapping("/roleList")
    @ResponseBody
    public Map<String,Object> getRoleList(){
        Map<String,Object> menuMap = new HashMap<>();
        menuMap.put("role",roleService.querySelectAll());
        menuMap.put("code", HttpStatus.OK.value());
        return menuMap;
    }

}
