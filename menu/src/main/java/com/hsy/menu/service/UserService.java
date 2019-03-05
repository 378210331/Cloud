package com.hsy.menu.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient("SECURITYSERVICE")
public interface UserService {


    @RequestMapping("/user/test")
    Map<String,Object> findOne();

}
