package com.yl.river.model.vo;

import com.yl.river.model.Book;

// 这里定义模型扩展
public class BookVO extends Book {

    private String code;

    public BookVO(Long id, String name, String code) {
        super(id, name);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
