package com.wy.demo.service;

import com.wy.demo.domain.ProductCategory;
import com.wy.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 15:32
 * 描述：
 */

public interface CategoryService {

    List<ProductCategory> findListByType(List<Integer> productType);
}
