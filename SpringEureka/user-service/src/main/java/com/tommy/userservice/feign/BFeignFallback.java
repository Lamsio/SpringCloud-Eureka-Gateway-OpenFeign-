package com.tommy.userservice.feign;

import org.springframework.stereotype.Component;

@Component
public class BFeignFallback implements ResourceClient {
    @Override
    public String getUsername() {
        return "你被熔断了！";
    }
}
