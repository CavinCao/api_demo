package com.cavin.springboot.api_demo.service.impl;

import com.cavin.springboot.api_demo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello()
    {
        return "Hello Spring Boot";
    }
}
