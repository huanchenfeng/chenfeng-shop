package com.chenfeng.chenfengmall.product;

import com.chenfeng.chenfengmall.product.controller.BrandController;
import com.chenfeng.chenfengmall.product.entity.BrandEntity;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
class ChenfengmallProductApplicationTests {
    @Autowired
    BrandController brandController;


    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
//        brandController.save(brandEntity);
//        System.out.println("保存成功----");
    }

}
