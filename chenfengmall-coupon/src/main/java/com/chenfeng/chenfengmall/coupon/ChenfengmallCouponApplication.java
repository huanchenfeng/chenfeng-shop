package com.chenfeng.chenfengmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ChenfengmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChenfengmallCouponApplication.class, args);
    }

}
