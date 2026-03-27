package com.tommy.springeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author USER
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaApplication.class, args);
    }

}
