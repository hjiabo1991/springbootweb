package com.hjb.springboot.web.springbootweb.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/test")
    public String hello() {
        return "test";
    }
}
