package com.mingliu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.config
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/7 17:25
 * @UpdateUser: mingliu
 */
@Configuration
public class JdbcTemplateConfig {
    @Bean(name = "mysqlJdbcTemplate")
    @Autowired
    public NamedParameterJdbcTemplate jdbcTemplate(@Qualifier("mysqlDataSource") DruidDataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }
}
