package com.wy.demo.service.impl;

import com.wy.demo.domain.ProductCategory;
import com.wy.demo.repository.CategoryRepository;
import com.wy.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 15:37
 * 描述：
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<ProductCategory> findListByType(List<Integer> productType){

        return categoryRepository.findByCategoryTypeIn(productType);
    }
}
