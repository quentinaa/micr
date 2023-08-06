package com.xiong.api.service;

import com.xiong.api.model.User;

public interface UserService {
    //根据手机号查询数据
    User queryByPhone(String phone);

    //用户注册
    int userRegister(String phone, String pword);
}
