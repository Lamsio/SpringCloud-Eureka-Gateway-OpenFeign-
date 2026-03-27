package com.tommy.userservice.controller;

import com.tommy.userservice.feign.ResourceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    private ResourceClient resourceClient;

    @GetMapping("/")
    public String index() {
        String username = resourceClient.getUsername();
        return "Hello World"+username;
    }

    @GetMapping("/dt/st")
    public String indexDT() {
        return "DTST";
    }
}
