package com.io.jyb.sys.services;

import com.io.jyb.sys.entity.RoleEntity;

import java.util.List;

public interface RoleService {
    List<RoleEntity> querySelectAll();
}
