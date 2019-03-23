package com.wy.demo.repository;

import com.wy.demo.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 14:50
 * 描述：
 */
public interface CategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /***
     * 根据类目的；类型查询
     * @param categoryType
     * @return
     */
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryType);


}
