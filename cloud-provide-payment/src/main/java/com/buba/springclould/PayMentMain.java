package com.buba.springclould;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan("com.buba.springcloud.dao")
public class PayMentMain {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain.class,args);
    }
}