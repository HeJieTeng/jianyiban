package com.io.jyb.sys.services.impl;

import com.io.jyb.sys.dao.UserDao;
import com.io.jyb.sys.entity.UserEntity;
import com.io.jyb.sys.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserEntity> getUsers() {
        return userDao.getUsers();
    }

//    @Override
//    public List<UserEntity> queryUserRoleList() {
//        return userDao.queryUserRoleList();
//    }
}
