package com.xiong.api.service;

import com.xiong.api.model.ProductInfo;
import com.xiong.api.pojo.MultiProduct;

import java.util.List;

public interface ProductService {
    //根据产品类型查询产品分页
    List<ProductInfo> queryByTypeLimit(Integer pType,Integer pageNo,Integer pageSize);
    //首页的多个产品数据
    MultiProduct queryIndexPageProducts();
}
