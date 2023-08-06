package com.xiong.api.service;

import com.xiong.api.pojo.BidInfoProduct;

import java.util.List;

public interface InvestService {
    //查询某个产品的投资记录
    List<BidInfoProduct> queryBidListByProductId(Integer productId,Integer pageNo,Integer pageSize);
}
