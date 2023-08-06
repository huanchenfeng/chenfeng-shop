package com.chenfeng.chenfengmall.thirdparty;

import com.aliyun.oss.OSS;
import com.aliyun.oss.model.PutObjectResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class ChenfengmallThirdPartyApplicationTests {
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
        PutObjectResult result = ossClient.putObject("chenfeng-shop","hahaha.jpg",inputStream);
        ossClient.shutdown();
        System.out.println("上传完成");
    }
    @Test
    void contextLoads() {
    }

}
