package com.yaozhou.service;

import com.yaozhou.dao.BookMapper;

/**
 * Created by WXHang on HANG at 2021/7/26 14:39
 * Desc：
 */
public class BookServiceImp implements BookService {
    //servies 调dao层：组合dao层
    private BookMapper bookMapper;

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook() {
        return 0;
    }
}
