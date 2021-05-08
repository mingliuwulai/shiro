package com.mingliu.repository.impl;

import com.mingliu.entity.RoleBean;
import com.mingliu.repository.interfaces.RoleRepository;
import com.mingliu.sql.RoleSql;
import com.mingliu.utils.MapToBeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.repository.impl
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 14:23
 * @UpdateUser: mingliu
 */
@Slf4j
@Repository
public class RoleRepositoryImpl extends BaseRepository implements RoleRepository {
    @Override
    public List<RoleBean> findRoleByUserId(int userId) {
        List<RoleBean> result = new ArrayList<>();
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("userId", userId);
        List<Map<String, Object>> roleList = jdbcTemplate.queryForList(RoleSql.findRoleByUserIdSql, namedParameters);
        for (Map<String, Object> roleMap : roleList) {
            RoleBean roleBean = new RoleBean();
            try {
                MapToBeanUtil.mapToBean(roleBean, roleMap);
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            result.add(roleBean);
        }
        return result;
    }
}
