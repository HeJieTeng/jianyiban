package com.io.jyb.sys.controller;


import com.io.jyb.sys.services.impl.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PageToController {


    @Autowired
    private MenuServiceImpl menuService;

    /***
     * 首页
     * @return
     */
    @GetMapping("/")
    public String index(Model model){
        Map<String,Object> menuMap = new HashMap<>();
        model.addAttribute("menu",menuService.getMenuList());
        System.out.println(model);
        return "sys/index/index";
    }

    /**
     * 登录页面
     * @return
     */
    @GetMapping("/login")
    public String login(){
        return "sys/login/login";
    }


    /**
     * 用户列表页面
     * @return
     */
    @GetMapping("/userlist")
    public String getUsers(){
        return "sys/user/userlist";
    }


    /**
     * 菜单列表页
     * @return
     */
    @GetMapping("menu")
    public String getMenu(){
        return "sys/menu/menu";
    }
    /**
     * 角色列表页
     * @return
     */
    @GetMapping("role")
    public String getRole(){
        return "sys/role/role";
    }

    /**
     * 权限列表页
     * @return
     */
    @GetMapping("perms")
    public String getPerms(){
        return "sys/perms/perms";
    }


    @GetMapping("userRole")
    public String getUserRole(){
        return "sys/user/userRole";
    }


}
