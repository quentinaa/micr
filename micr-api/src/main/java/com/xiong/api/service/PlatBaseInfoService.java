package com.xiong.api.service;

import com.xiong.api.pojo.BaseInfo;

/**
 * Package:com.xiong.api.service
 * Date:2022/3/1 16:01
 */
public interface PlatBaseInfoService {

    /** 计算利率， 注册人数， 累计成交金额 */
    BaseInfo queryPlatBaseInfo();

}
