package com.xiong.common.enums;
public enum RCode {
    UNKOWN(303,"请稍后重试"),
    SUCCESS(200,"请求成功");
    //应答码
    private int code;
    private String text;
    private RCode(int c,String t){
        this.code=c;
        this.text=t;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
