package com.hsy.security.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户微服务
 */
@Service
public class UserService {

    public Map<String,Object> findOne(){
        Map<String,Object> map = new HashMap<>();
        map.put("key","key");
        map.put("value","value");
        return map;
    }

}
