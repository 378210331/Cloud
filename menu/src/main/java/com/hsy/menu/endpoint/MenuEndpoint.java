package com.hsy.menu.endpoint;

import com.hsy.menu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/menu/")
public class MenuEndpoint {

    @Autowired
    private UserService userService;


    @RequestMapping("user")
    public Map<String,Object> loadUserByFeign() {
        return this.userService.findOne();
    }

}
