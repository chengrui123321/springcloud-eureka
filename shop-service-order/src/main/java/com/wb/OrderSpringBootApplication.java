package com.wb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: r.cheng
 * @Date: 2020/3/1 15:20
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderSpringBootApplication.class, args);
    }

    // 基于Ribbon实现负载均衡
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
