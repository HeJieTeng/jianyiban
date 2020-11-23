package com.io.jyb.sys.dao;

import com.io.jyb.sys.entity.RoleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface RoleDao {

    List<RoleEntity> querySelectAll();
}
