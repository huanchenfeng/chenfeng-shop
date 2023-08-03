package com.chenfeng.chenfengmall.product;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.common.auth.CredentialsProviderFactory;
import com.aliyun.oss.common.auth.EnvironmentVariableCredentialsProvider;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;
import com.aliyuncs.exceptions.ClientException;
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
    @Autowired
    OSS ossClient;
    @Test
    public void testUpload() throws FileNotFoundException {
//        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
//        String endpoint = "oss-cn-shanghai.aliyuncs.com";
//        String accessKeyId="LTAI5tEqbcuPVUupC6jeYZP4";
//        String accessKeySecret="jyfrI6iZmfEKhII3pXqrVqFF7oaSox";
//        // 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId,accessKeySecret);
        InputStream inputStream = new FileInputStream("C:\\Users\\梦幻晨风\\Desktop\\项目图像\\002.jpg");
        // 创建PutObject请求。
        PutObjectResult result = ossClient.putObject("chenfeng-shop","bug.jpg",inputStream);
        ossClient.shutdown();
        System.out.println("上传完成");
    }

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandController.save(brandEntity);
        System.out.println("保存成功----");
    }

}
