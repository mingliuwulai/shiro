package com.mingliu.repository.impl;

import com.mingliu.entity.User;
import com.mingliu.repository.interfaces.UserRepository;
import com.mingliu.sql.UserSql;
import com.mingliu.utils.MapToBeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.repository.impl
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 14:38
 * @UpdateUser: mingliu
 */
@Slf4j
@Repository
public class UserRepositoryImpl extends BaseRepository implements UserRepository {
    @Override
    public User findByAccount(String account) {
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("account", account);
        Map<String, Object> userMap = jdbcTemplate.queryForMap(UserSql.findByAccount, namedParameters);
        User user = new User();
        try {
            MapToBeanUtil.mapToBean(user, userMap);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return user;
    }
}
