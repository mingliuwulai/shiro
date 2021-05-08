package com.mingliu.sql;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.sql
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 14:26
 * @UpdateUser: mingliu
 */
public class RoleSql {
    public static final String findRoleByUserIdSql = "SELECT role.id, role FROM role, user, user_role ur WHERE role.id = ur.role_id and ur.user_id = user.id and user.id = :userId";
}
