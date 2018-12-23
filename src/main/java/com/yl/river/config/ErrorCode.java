package com.yl.river.config;

public enum ErrorCode {


    /**
     * 提示：每个业务有自己的错误码范围.
     */

    // 操作成功
    SUCCESS(100, "操作成功"),

    // 通用异常 (内置：100~199)
    SYSTEM_ERROR(100, "系统错误"),

    // 业务Book异常（范围：200~299）
    PARAM_TOO_LONG(200, "参数超长"),
    PARAM_TYPE_ERROR(201, "参数类型错误"),
    FILE_IMPORT_ERROR(201, "文件导入出错"),

    // 业务B异常 （范围：300~399）
    TIMEOUT_ERROR(301, "处理超时"),


    OTHER_ERROR(-1, "其他错误");

    private int code;

    private String msg;

    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
