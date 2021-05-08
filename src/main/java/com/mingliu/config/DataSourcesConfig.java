package com.mingliu.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.config
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/7 17:25
 * @UpdateUser: mingliu
 */
@Configuration
public class DataSourcesConfig {

    @Primary
    @Bean(name = "mysqlDataSource")
    @Qualifier("mysqlDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.my-mysql")
    public DruidDataSource mysqlDatasource() {
        return DruidDataSourceBuilder.create().build();
    }

}
