package com.xiong.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Package:com.xiong.api.pojo
 * Date:2022/3/1 16:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseInfo implements Serializable {

    /*收益率平均值*/
    private BigDecimal historyAvgRate;
    /*累计成交金额*/
    private BigDecimal sumBidMoney;
    /*注册人数*/
    private Integer registerUsers;

}
