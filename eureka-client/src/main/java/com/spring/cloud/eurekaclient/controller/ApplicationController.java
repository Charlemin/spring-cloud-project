package com.spring.cloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class ApplicationController {

    @Value("${server.port}")
    private Integer port;


    @RequestMapping("/test")
    public String index(@RequestParam(value = "name") String name) {
        return "This is euraka client! name: " + name + " port: " + port;
    }
}
