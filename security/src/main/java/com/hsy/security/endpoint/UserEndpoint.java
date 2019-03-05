package com.hsy.security.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user/")
public class UserEndpoint {

    @GetMapping("test")
    public Map<String,Object> test(){
        Map<String,Object> map = new HashMap<>();
        map.put("key","key");
        map.put("value","value");
        return map;
    }
}
