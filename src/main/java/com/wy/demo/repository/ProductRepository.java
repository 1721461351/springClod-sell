package com.wy.demo.repository;

import com.wy.demo.domain.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 13:59
 * 描述：
 */
public interface ProductRepository extends JpaRepository<ProductInfo, String> {


    /***
     * 查询所有的在架商品
     * @param status
     * @return
     */
    public List<ProductInfo> findByProductStatus(Integer status);
}
