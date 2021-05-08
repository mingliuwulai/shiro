package com.mingliu.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.bean
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 10:20
 * @UpdateUser: mingliu
 */
@Data
@NoArgsConstructor
public class ServerResponseVO<T> implements Serializable {
    private static final long serialVersionUID = -7820253496170695114L;
    // 响应码
    private Integer code;

    // 描述信息
    private String message;

    // 响应内容
    private T data;

    private ServerResponseVO(ServerResponseEnum responseCode) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
    }

    private ServerResponseVO(ServerResponseEnum responseCode, T data) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
        this.data = data;
    }

    private ServerResponseVO(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    /**
     * 返回成功信息
     * @param data      信息内容
     * @param <T>
     * @return
     */
    public static<T> ServerResponseVO success(T data) {
        return new ServerResponseVO<>(ServerResponseEnum.SUCCESS, data);
    }

    /**
     * 返回成功信息
     * @return
     */
    public static ServerResponseVO success() {
        return new ServerResponseVO(ServerResponseEnum.SUCCESS);
    }

    /**
     * 返回错误信息
     * @param responseCode      响应码
     * @return
     */
    public static ServerResponseVO error(ServerResponseEnum responseCode) {
        return new ServerResponseVO(responseCode);
    }
}
