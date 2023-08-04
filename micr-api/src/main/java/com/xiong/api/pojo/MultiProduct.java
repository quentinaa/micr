package com.xiong.api.pojo;

import com.xiong.api.model.ProductInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author xiong
 * @version 1.0
 * @description 多个产品的数据
 * @date 2023/8/3 19:03:23
 */
@Data
public class MultiProduct implements Serializable {
    private List<ProductInfo> sanBiao;
    private List<ProductInfo> xinShouBao;
    private List<ProductInfo> youXuan;
}
