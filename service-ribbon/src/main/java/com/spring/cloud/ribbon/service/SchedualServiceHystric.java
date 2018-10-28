package com.spring.cloud.ribbon.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHystric implements SchedualService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
