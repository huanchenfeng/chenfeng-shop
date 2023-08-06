package com.chenfeng.chenfengmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ChenfengmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChenfengmallProductApplication.class, args);
    }

}
