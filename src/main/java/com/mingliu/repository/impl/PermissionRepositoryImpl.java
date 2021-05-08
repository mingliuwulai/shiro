package com.mingliu.repository.impl;

import com.mingliu.repository.interfaces.PermissionRepository;
import com.mingliu.sql.PermissionSql;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.repository.impl
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 11:14
 * @UpdateUser: mingliu
 */
@Slf4j
@Repository
public class PermissionRepositoryImpl extends BaseRepository implements PermissionRepository {
    @Override
    public List<String> findByRoleId(List<Integer> roleIds) {
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("roleIds", roleIds);
        List<Map<String, Object>> permissions = jdbcTemplate.queryForList(PermissionSql.findByRoleIdSql, namedParameters);
        return permissions.stream().map(r -> r.get("permission").toString()).collect(Collectors.toList());
    }
}
