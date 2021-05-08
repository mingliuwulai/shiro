package com.mingliu.sql;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.sql
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 11:19
 * @UpdateUser: mingliu
 */
public class PermissionSql {
    public static final String findByRoleIdSql = "SELECT permission FROM permission, role_permission rp WHERE rp.permission_id = permission.id AND rp.role_id in (:roleIds)";
}
