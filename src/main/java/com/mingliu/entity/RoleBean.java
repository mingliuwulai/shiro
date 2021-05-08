package com.mingliu.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.entity
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 10:41
 * @UpdateUser: mingliu
 */
@Data
@ToString
public class RoleBean implements Serializable {
    private static final long serialVersionUID = -930867438001144721L;

    private Integer id;

    private String role;

    private String desc;
}
