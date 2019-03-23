package com.wy.demo.service;

import com.wy.demo.domain.ProductInfo;
import com.wy.demo.myenum.ProductStatusEnum;
import com.wy.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 15:25
 * 描述：
 */
public interface ProductService {

    public List<ProductInfo> findAllUp();
}
