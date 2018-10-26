package com.spring.cloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

    @Value("${server.port}")
    private Integer port;
    @RequestMapping("")
    public String index() {
        return "This is euraka client! port: " + port;
    }
}
