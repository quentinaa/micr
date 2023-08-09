package com.xiong.api.service;

import com.xiong.api.model.User;
import com.xiong.api.pojo.UserAccountInfo;

public interface UserService {
    //根据手机号查询数据
    User queryByPhone(String phone);

    //用户注册
    int userRegister(String phone, String pword);

    //登录
    User userLogin(String phone, String pword);

    //更新实名信息
    boolean modifyRealName(String phone, String name, String idCard);

    //获取用户详细信息
    UserAccountInfo queryUserAllInfo(Integer uid);

    User queryByid(Integer uid);
}
