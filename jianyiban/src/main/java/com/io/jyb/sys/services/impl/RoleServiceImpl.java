package com.io.jyb.sys.services.impl;

import com.io.jyb.sys.dao.RoleDao;
import com.io.jyb.sys.entity.RoleEntity;
import com.io.jyb.sys.services.RoleService;
import com.io.jyb.sys.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<RoleEntity> querySelectAll() {
        List<RoleEntity> roleEntities = roleDao.querySelectAll();
        DateUtils dateUtils = new DateUtils();
        for (RoleEntity roleEntity:roleEntities){
            String cTime = dateUtils.timeStamp2Date(roleEntity.getCreate_time(),null);
            roleEntity.setCreate_time(cTime);
        }
        return roleEntities;
    }
}
