package com.io.jyb.sys.services.impl;

import com.io.jyb.sys.dao.PermsDao;
import com.io.jyb.sys.entity.PermsEntity;

import com.io.jyb.sys.services.PermsService;
import com.io.jyb.sys.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PermsServiceImpl implements PermsService {

    @Autowired
    private PermsDao permsDao;


    @Override
    public List<PermsEntity> queryAllPerms() {
        List<PermsEntity> permsEntities = permsDao.queryAllPerms();
        DateUtils dateUtils = new DateUtils();
        for (PermsEntity permsEntity:permsEntities){
            String cTime = dateUtils.timeStamp2Date(permsEntity.getCreate_time(),null);
            permsEntity.setCreate_time(cTime);
        }
        return permsEntities;
    }
}
