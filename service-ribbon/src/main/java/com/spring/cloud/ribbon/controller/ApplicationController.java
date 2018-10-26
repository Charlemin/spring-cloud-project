package com.spring.cloud.ribbon.controller;

import com.spring.cloud.ribbon.service.ApplicationService;
import com.spring.cloud.ribbon.service.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @Autowired
    private SchedualService schedualService;

    @RequestMapping("/index")
    public String index() {
        return applicationService.httpGet("service-ribbon");
    }



    @RequestMapping("/test")
    public String test() {
        return schedualService.sayHiFromClientOne("feign-client");
    }
}
