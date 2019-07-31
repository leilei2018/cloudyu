package com.zk.edu.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
@Service
@FeignClient("user")
public interface HelloService {
    @GetMapping("/hello")
    public String hello();
}
