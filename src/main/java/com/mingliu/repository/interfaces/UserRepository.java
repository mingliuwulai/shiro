package com.mingliu.repository.interfaces;

import com.mingliu.entity.User;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.repository.interfaces
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 14:33
 * @UpdateUser: mingliu
 */
public interface UserRepository {
    User findByAccount(String account);
}
