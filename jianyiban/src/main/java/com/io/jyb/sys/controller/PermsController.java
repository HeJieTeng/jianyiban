package com.io.jyb.sys.controller;

import com.io.jyb.sys.services.impl.PermsServiceImpl;
import com.io.jyb.sys.services.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("perms")
public class PermsController {

    @Autowired
    private PermsServiceImpl permsService;


    @RequestMapping("/permsList")
    @ResponseBody
    public Map<String,Object> getPermsList(){
        Map<String,Object> menuMap = new HashMap<>();
        menuMap.put("authority",permsService.queryAllPerms());
        menuMap.put("code", HttpStatus.OK.value());
        return menuMap;
    }

}
