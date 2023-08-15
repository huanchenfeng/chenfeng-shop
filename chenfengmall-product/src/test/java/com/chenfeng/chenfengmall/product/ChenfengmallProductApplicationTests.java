package com.chenfeng.chenfengmall.product;

import com.chenfeng.chenfengmall.product.controller.BrandController;
import com.chenfeng.chenfengmall.product.entity.BrandEntity;
import com.chenfeng.chenfengmall.product.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
class ChenfengmallProductApplicationTests {
    @Autowired
    BrandController brandController;
@Autowired
    CategoryService categoryService;

    @Test
    void contextLoads() {
        Long[] catelogPath = categoryService.findCatelogPath(225L);
        System.out.println(Arrays.asList(catelogPath));
    }

}
