package com.io.jyb.sys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity implements Serializable {

    private long uid;
    private String username;
    private String password;
    private String phone;
    private String email;
    private int sex;
    private String salt;
    private int status;
    private List<RoleEntity> roleEntities;
}
