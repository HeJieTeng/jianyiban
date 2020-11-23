package com.io.jyb.sys.services.impl;

import com.io.jyb.sys.dao.MenuDao;
import com.io.jyb.sys.entity.MenuEntity;
import com.io.jyb.sys.services.MenuService;
import com.io.jyb.sys.utils.DateUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;


    @Override
    public List<MenuEntity> getMenuList() {

//        查询所有的菜单
        List<MenuEntity> menuEntities = menuDao.getMenuList();

//        新建一个空的list用来存放一级菜单
        List<MenuEntity> list = new ArrayList<>();
        for (int i = 0; i < menuEntities.size(); i++) {

            if (menuEntities.get(i).getPid() == 0) {
                list.add(menuEntities.get(i));
            }
        }
        for (MenuEntity menuEntity : list) {
//            遍历子菜单
            menuEntity.setMenuEntities(getChildMenu(menuEntity.getMid(), menuEntities));
        }
        return list;
    }


    /***
     * 递归查询子菜单
     * @return
     */
    public List<MenuEntity> getChildMenu(long id, List<MenuEntity> rootMenu) {
        List<MenuEntity> childList = new ArrayList<>();
        for (MenuEntity menuEntity : rootMenu) {
            if (menuEntity.getPid() != 0) {
                if (menuEntity.getPid() == id) {
                    childList.add(menuEntity);
                }
            }
        }
        for (MenuEntity menuEntity : childList) {
            if (StringUtils.isBlank(menuEntity.getMenu_url())) {
                menuEntity.setMenuEntities(getChildMenu(menuEntity.getPid(), rootMenu));
            }
        }
        if (childList.size() == 0) {
            return null;
        }
        return childList;
    }


    /**
     * 查询菜单列表
     *
     * @return
     */
    @Override
    public List<MenuEntity> findAll() {
        List<MenuEntity> menuEntities = menuDao.getMenuList();
        DateUtils dateUtils = new DateUtils();
        for (int i = 0; i < menuEntities.size(); i++) {
            String ctime = dateUtils.timeStamp2Date(menuEntities.get(i).getCreate_time(), null);
            menuEntities.get(i).setCreate_time(ctime);
        }
        return menuEntities;
    }

}
