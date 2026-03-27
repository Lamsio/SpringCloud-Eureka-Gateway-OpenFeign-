package com.tommy.userservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author USER
 */
@FeignClient(value = "resource-service", fallback = BFeignFallback.class)
public interface ResourceClient {

    @GetMapping("/")
    String getUsername();
}

