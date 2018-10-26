package com.spring.cloud.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Service
public class ApplicationService {

    @Autowired
    RestTemplate restTemplate;

    public String httpGet(String name) {
        return restTemplate.getForObject("http://eureka-client/index/test?name=" + name, String.class);
    }

}
