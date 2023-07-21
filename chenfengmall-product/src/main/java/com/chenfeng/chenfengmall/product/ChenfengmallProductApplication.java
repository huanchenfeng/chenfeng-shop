package com.chenfeng.chenfengmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.chenfeng.chenfengmall.product.dao")
@SpringBootApplication
public class ChenfengmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChenfengmallProductApplication.class, args);
    }

}
