package com.wy.demo.VO;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 15:51
 * 描述：返回给前端的商品详情信息
 */
@Data
public class ProductInfoVO {

    private String id;

    private String name;

    private BigDecimal price;

    private String description;

    private String icon;
}
