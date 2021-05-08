package com.mingliu.repository.impl;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.annotation.Resource;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.repository.impl
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 11:14
 * @UpdateUser: mingliu
 */
public class BaseRepository {
    @Resource(name = "mysqlJdbcTemplate")
    NamedParameterJdbcTemplate jdbcTemplate;
}
