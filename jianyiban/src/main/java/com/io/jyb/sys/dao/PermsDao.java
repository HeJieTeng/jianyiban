package com.io.jyb.sys.dao;

import com.io.jyb.sys.entity.PermsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermsDao {

    List<PermsEntity> queryAllPerms();

}
