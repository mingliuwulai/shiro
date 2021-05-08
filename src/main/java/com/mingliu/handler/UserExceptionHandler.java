package com.mingliu.handler;

import com.mingliu.entity.ServerResponseEnum;
import com.mingliu.entity.ServerResponseVO;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.handler
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 10:13
 * @UpdateUser: mingliu
 */
@RestControllerAdvice
public class UserExceptionHandler {
    @ExceptionHandler(UnauthorizedException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ServerResponseVO unAuthorizedExceptionHandler(UnauthorizedException e) {
        return ServerResponseVO.error(ServerResponseEnum.UNAUTHORIZED);
    }
}
