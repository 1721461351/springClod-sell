package com.wy.demo.service.impl;

import com.wy.demo.domain.ProductInfo;
import com.wy.demo.myenum.ProductStatusEnum;
import com.wy.demo.repository.ProductRepository;
import com.wy.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 15:40
 * 描述：
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    /***
     * 查询所有在架商品的列表
     * @return
     */
    @Override
    public List<ProductInfo> findAllUp() {
        List<ProductInfo> productInfoList = productRepository.findByProductStatus(ProductStatusEnum.UP.getStatus());
        return productInfoList;
    }
}
