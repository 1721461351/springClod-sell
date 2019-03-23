package com.wy.demo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 13:53
 * 描述：
 */
@Entity
@Data
public class ProductInfo {
    /**商品的id*/
    @Id
    private String productId;

    /**商品的名称*/
    private String productName;

    /**商品的单价*/
    private BigDecimal productPrice;

    /**商品的库存*/
    private Integer productNum;

    /**商品的描述*/
    private String productDescription;

    /**商品的图片*/
    private String productImg;

    /**类目编号*/
    private Integer productType;

    /**商品的状态 0正常 1下架*/
    private Integer productStatus;

    private Date createTime;

}
