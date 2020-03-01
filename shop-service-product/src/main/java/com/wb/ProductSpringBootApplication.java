package com.wb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: r.cheng
 * @Date: 2020/3/1 11:44
 * @Description:
 * @Version: 1.0
 */
// 开启Eureka客户端 @EnableEurekaClient == @EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@EntityScan("com.wb.entity")
public class ProductSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductSpringBootApplication.class, args);
    }

}
