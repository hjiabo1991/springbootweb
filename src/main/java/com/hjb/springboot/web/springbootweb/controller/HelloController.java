package com.hjb.springboot.web.springbootweb.controller;

import com.hjb.springboot.web.springbootweb.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/getUser")
    public User getUser() {
        User user = new User();
        user.setUserId("001");
        user.setUserName("hjb");
        return user;
    }
}
