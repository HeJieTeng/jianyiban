package com.io.jyb.sys.controller;

import com.io.jyb.sys.services.impl.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("menu")
public class MenuController {
    @Autowired
    private MenuServiceImpl menuService;


    @RequestMapping("menulist")
    @ResponseBody
    public Map<String,Object> getMenu(){
        Map<String,Object> menuMap = new HashMap<>();
        menuMap.put("menu",menuService.findAll());
        menuMap.put("code", HttpStatus.OK.value());
        return menuMap;
    }
}
