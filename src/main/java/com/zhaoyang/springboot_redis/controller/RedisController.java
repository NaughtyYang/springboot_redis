package com.zhaoyang.springboot_redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/test")
    public String test(){
        redisTemplate.opsForValue().set("k1","zhaoyangyang");

        String k1 = (String)redisTemplate.opsForValue().get("k1");
        return k1;
    }
}
