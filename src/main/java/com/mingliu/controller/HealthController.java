package com.mingliu.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.controller
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/7 17:23
 * @UpdateUser: mingliu
 */
public class HealthController extends BaseController{
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "")
    @ResponseBody
    public String health() {
        logger.info("Health check passed.");
        return "pong";
    }
}
