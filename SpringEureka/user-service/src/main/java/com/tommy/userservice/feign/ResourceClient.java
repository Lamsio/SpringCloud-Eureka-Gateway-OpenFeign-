package com.tommy.userservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author USER
 */
@FeignClient("resource-service")
public interface ResourceClient {

    @GetMapping("/")
    String getUsername();
}
