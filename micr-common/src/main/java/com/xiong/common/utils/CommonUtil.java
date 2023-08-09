package com.xiong.common.utils;

import java.math.BigDecimal;
import java.util.regex.Pattern;

/**
 * @author xiong
 * @version 1.0
 * @description 处理分页逻辑
 * @date 2023/8/3 18:38:23
 */
public class CommonUtil {
    //处理pageNo
    public static int defaultPageNo(Integer pageNo){
        int pNo=pageNo;
        if (pageNo==null||pageNo<1){
            pNo=1;
        }
        return pNo;
    }
    //处理pageSize
    public static int defaultPageSize(Integer pageSize){
        int pSize=pageSize;
        if (pageSize==null||pageSize<1){
            pSize=1;
        }
        return pSize;
    }

    //手机号脱敏
    public static String desensitization(String phone){
        String result="***********";
        if (phone!=null&&phone.trim().length()==11){
            result=phone.substring(0,3)+"******"+phone.substring(9);
        }
        return result;
    }
    //检查手机号
    public static boolean checkPhone(String phone){
        return Pattern.matches("^1[1-9]\\d{9}$",phone);
    }


    public static boolean ge(BigDecimal n1,BigDecimal n2){
        return n1.compareTo(n2)>=0;
    }
}
