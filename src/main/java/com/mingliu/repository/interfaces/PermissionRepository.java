package com.mingliu.repository.interfaces;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.repository.interfaces
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 11:13
 * @UpdateUser: mingliu
 */
public interface PermissionRepository {
    List<String> findByRoleId(List<Integer> roleIds);
}
