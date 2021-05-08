package com.mingliu.sql;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.sql
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 14:36
 * @UpdateUser: mingliu
 */
public class UserSql {
    public static final String findByAccount = "SELECT id, account, password, username FROM user WHERE account = :account";
}
