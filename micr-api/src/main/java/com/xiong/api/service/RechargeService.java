package com.xiong.api.service;

import com.xiong.api.model.RechargeRecord;

import java.util.List;

public interface RechargeService {
    List<RechargeRecord> queryByUid(Integer uid,Integer pageNo,Integer pageSize);
}
