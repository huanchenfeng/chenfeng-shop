package com.chenfeng.chenfengmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.chenfeng.chenfengmall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class ChenfengmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChenfengmallMemberApplication.class, args);
    }

}
