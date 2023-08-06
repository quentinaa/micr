package com.xiong.api.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author xiong
 * @version 1.0
 * @description
 * @date 2023/8/6 10:24:08
 */
@Data
public class BidInfoProduct implements Serializable {
    private Integer id;
    private String phone;
    private String bidTime;
    private BigDecimal bidMoney;
}
