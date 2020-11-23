package com.io.jyb.sys.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class PermsEntity implements Serializable {

    private long auth_id;
    private String auth_name;
    private String remark;
    private String url;
    private long create_user_id;
    private String create_time;
}
