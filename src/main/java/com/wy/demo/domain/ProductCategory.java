package com.wy.demo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 14:18
 * 描述：
 */
@Data
@Table(name = "category")
@Entity  //这个也要加上
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;

    private int categoryType;

    private String categoryName;
}
