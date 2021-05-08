package com.mingliu.repository.interfaces;

import com.mingliu.entity.RoleBean;

import java.util.List;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.repository.interfaces
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 14:18
 * @UpdateUser: mingliu
 */
public interface RoleRepository {
    List<RoleBean> findRoleByUserId(int userId);
}
