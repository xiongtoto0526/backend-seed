package com.yl.river.controller.response;


import com.yl.river.config.ErrorCode;

public class CommonResponse {

    private int code;
    private String message;
    private Object data;

    public CommonResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public CommonResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static CommonResponse successResponse (Object data){
      return new CommonResponse(ErrorCode.SUCCESS.getCode(), ErrorCode.SUCCESS.getMsg(),data);
    }

}

