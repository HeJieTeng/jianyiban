package com.io.jyb.sys.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoleEntity implements Serializable {

    private long role_id;
    private String role_name;
    private String remark;
    private long create_user_id;
    private String create_time;


}
