package com.wy.demo.VO;

import lombok.Data;

import java.util.List;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 15:43
 * 描述：http请求返回的最外层对象
 */
@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;
}
