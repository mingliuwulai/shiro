package com.mingliu.service.impl;

import com.mingliu.repository.interfaces.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.service.impl
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 11:11
 * @UpdateUser: mingliu
 */
public class BaseService {
    @Autowired
    PermissionRepository permissionRepository;
}
