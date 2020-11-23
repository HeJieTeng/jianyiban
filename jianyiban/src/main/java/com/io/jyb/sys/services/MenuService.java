package com.io.jyb.sys.services;

import com.io.jyb.sys.entity.MenuEntity;

import java.util.List;

public interface MenuService {

    List<MenuEntity> getMenuList();

    List<MenuEntity> findAll();
}
