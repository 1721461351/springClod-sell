package com.wy.demo.myenum;

import lombok.Data;
import lombok.Getter;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 15:27
 * 描述：
 */
@Getter
public enum  ProductStatusEnum {
    UP(0,"在架"),
    DOWM(1,"下架")
    ;

    private String message;
    private Integer status;

    ProductStatusEnum(Integer status, String message) {
        this.message = message;
        this.status = status;
    }
}
