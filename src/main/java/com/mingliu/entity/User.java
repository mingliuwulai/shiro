package com.mingliu.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.entity
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 10:35
 * @UpdateUser: mingliu
 */
@Data
@ToString
public class User implements Serializable {
    private static final long serialVersionUID = -8358062416931242544L;
    private Integer id;

    private String account;

    private String password;

    private String username;
}
