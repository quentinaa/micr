package com.xiong.api.pojo;

import com.xiong.api.model.User;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author xiong
 * @version 1.0
 * @description
 * @date 2023/8/7 19:58:00
 */
@Data
public class UserAccountInfo extends User {
    private BigDecimal availableMoney;
}
