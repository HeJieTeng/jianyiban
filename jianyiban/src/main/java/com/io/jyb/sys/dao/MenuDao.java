package com.io.jyb.sys.dao;

import com.io.jyb.sys.entity.MenuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MenuDao {

    List<MenuEntity> getMenuList();

}
