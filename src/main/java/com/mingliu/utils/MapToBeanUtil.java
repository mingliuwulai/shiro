package com.mingliu.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: shiro
 * @Package: com.mingliu.utils
 * @Description:
 * @Author: mingliu
 * @CreateDate: 2021/5/8 15:14
 * @UpdateUser: mingliu
 */
public class MapToBeanUtil {
    public static <T> void mapToBean(T t, Map<String, Object> map) throws InvocationTargetException, IllegalAccessException {
        if (!map.isEmpty()) {
            JSONObject data = JSON.parseObject(JSON.toJSONStringWithDateFormat(map, "yyyy-MM-dd HH:mm:ss"));
            Map<String, Object> tmp = new HashMap<>(data.size());
            for (Map.Entry<String, Object> entry : data.entrySet()) {
                tmp.put(StringMapUtil.underlineToHump(entry.getKey()), entry.getValue());
            }
            BeanUtils.populate(t, tmp);
        }
    }
}
