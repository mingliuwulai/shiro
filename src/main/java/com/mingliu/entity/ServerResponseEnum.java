package com.mingliu.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.entity
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 10:23
 * @UpdateUser: mingliu
 */
@Getter
@AllArgsConstructor
public enum ServerResponseEnum {
    SUCCESS(0, "成功"),
    ERROR(10, "失败"),

    ACCOUNT_NOT_EXIST(11, "账号不存在"),
    DUPLICATE_ACCOUNT(12, "账号重复"),
    ACCOUNT_IS_DISABLED(13, "账号被禁用"),
    INCORRECT_CREDENTIALS(14, "账号或密码错误"),
    NOT_LOGIN_IN(15, "账号未登录"),
    UNAUTHORIZED(16, "没有权限");

    Integer code;
    String message;
}
