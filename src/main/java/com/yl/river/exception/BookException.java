package com.yl.river.exception;

import com.yl.river.model.Book;

public class BookException extends RuntimeException {

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BookException(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
