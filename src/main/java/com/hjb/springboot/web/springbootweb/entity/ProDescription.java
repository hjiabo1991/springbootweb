package com.hjb.springboot.web.springbootweb.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProDescription {

    @Value("${com.hjb.title}")
    private String title;

    @Value("${com.hjb.description}")
    private String description;
}
