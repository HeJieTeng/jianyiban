package com.io.jyb.sys.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class MenuEntity implements Serializable {
    private long mid;
    private String menu_name;
    private String menu_url;
    private long pid;
    private String descript;
    private int status;
    private String create_time;
    private List<MenuEntity> menuEntities;
}
