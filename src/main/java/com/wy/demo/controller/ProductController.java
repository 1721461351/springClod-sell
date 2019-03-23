package com.wy.demo.controller;

import com.wy.demo.VO.ProductInfoVO;
import com.wy.demo.VO.ProductVO;
import com.wy.demo.VO.Result;
import com.wy.demo.domain.ProductCategory;
import com.wy.demo.domain.ProductInfo;
import com.wy.demo.service.CategoryService;
import com.wy.demo.service.ProductService;
import com.wy.demo.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 14:15
 * 描述：
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    /***
     * 1.查询所有在架商品
     * 2.获取类目列表
     * 3.查询类目
     * 4.构造数据
     */
    @RequestMapping(method = RequestMethod.GET, value = "/list")
    public Result list() {
        // 1.查询所有在架商品
        List<ProductInfo> productsUp = productService.findAllUp();
        // 2.所有在架商品的type
        List<Integer> typeList = productsUp.stream()
                .map(productInfo -> productInfo.getProductType())
                .collect(Collectors.toList());
        // 3.商品的类目
        List<ProductCategory> productCategories = categoryService.findListByType(typeList);
        // 4.构造数据
//        productVO.setCategoryName();
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : productCategories) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());
            //还要一个productInfolist
            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productsUp) {
                if (productInfo.getProductType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    productInfoVO.setName(productInfo.getProductName());
                    productInfoVO.setDescription(productInfo.getProductDescription());
                    productInfoVO.setIcon(productInfo.getProductImg());
                    productInfoVO.setPrice(productInfo.getProductPrice());
                    productInfoVO.setId(productInfo.getProductId());

                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setFoods(productInfoVOList);
            productVOList.add(productVO);
        }
//        Result result = new Result<>();
//        result.setCode(1);
//        result.setData(productVOList);
//        result.setMsg("成功");
        return ResultUtil.success(productVOList);
    }
}
