package com.io.jyb.sys.dao;

import com.io.jyb.sys.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserDao {

    List<UserEntity> getUsers();
//    List<UserEntity> queryUserRoleList();
}
