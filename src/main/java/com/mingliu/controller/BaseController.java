package com.mingliu.controller;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.annotation.Resource;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.controller
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/7 17:23
 * @UpdateUser: mingliu
 */
public class BaseController {
    @Resource(name = "mysqlJdbcTemplate")
    NamedParameterJdbcTemplate jdbcTemplate;
}
