package com.zhaoyang.springboot_redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class SpringbootRedisApplicationTests {

	@Autowired
	RedisTemplate<Object,Object> redisTemplate;

	@Autowired
	StringRedisTemplate stringRedisTemplate;

	@Test
	void contextLoads() {
		String k1 = stringRedisTemplate.opsForValue().get("k1");
		System.out.println(k1);
	}

}
