package com.wy.demo.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 15:47
 * 描述：
 */
@Data
public class ProductVO {

    //返回给前端的是name
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    private List<ProductInfoVO> foods;
}
