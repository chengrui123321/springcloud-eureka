package com.wb.controller;

import com.wb.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Auther: r.cheng
 * @Date: 2020/3/1 15:20
 * @Description:
 * @Version: 1.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/buy/{id}")
    public Product buy(@PathVariable Long id) {
        // 发送请求
        // 使用Ribbon，可以直接使用服务名称进行调用
        Product product = restTemplate.getForObject("http://SHOP-SERVICE-PRODUCT/product/get/" + id, Product.class);
        return product;
    }


//    @GetMapping("/buy/{id}")
//    public Product buy(@PathVariable Long id) {
//        // 根据服务名获取所有的注册实例
//        List<ServiceInstance> instances = discoveryClient.getInstances("SHOP-SERVICE-PRODUCT");
//        ServiceInstance instance = null;
//        if (!ObjectUtils.isEmpty(instances)) {
//            instance = instances.get(0);
//        }
//        // 发送请求
//        return restTemplate.getForObject("http://"+ instance.getHost() +":"+ instance.getPort() +"/product/get/" + id, Product.class);
//    }

}
