package com.wy.demo.repository;

import com.wy.demo.domain.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 14:55
 * 描述：
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> categories = categoryRepository.findByCategoryTypeIn(Arrays.asList(5, 10));

        Assert.assertEquals(2,categories.size());
    }
}