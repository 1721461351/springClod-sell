package com.wy.demo.repository;

import com.wy.demo.domain.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 14:02
 * 描述：
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void findByProductStatus() {
        List<ProductInfo> product = productRepository.findByProductStatus(1);
        Assert.assertEquals(1,product.size());

    }
}