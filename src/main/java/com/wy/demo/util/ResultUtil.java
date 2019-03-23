package com.wy.demo.util;

import com.wy.demo.VO.Result;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 16:59
 * 描述：
 */
public class ResultUtil {

    public static Result<Object> success(Object data){
        Result result = new Result();
        result.setMsg("成功");
        result.setData(data);
        result.setCode(1);
        return result;
    }
}
