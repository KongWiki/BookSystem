package com.wkk.entity;

/**
 * @Time: 19-11-30下午4:03
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Book {
    private long bookId;
    private String name;
    private int number;
    private String detail;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
