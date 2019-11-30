package com.wkk.entity;

/**
 * @Time: 19-11-30下午4:03
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Book {
    private long book_id;
    private String name;
    private int number;
    private String detail;

    public long getBook_id() {
        return book_id;
    }

    public void setBook_id(long book_id) {
        this.book_id = book_id;
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
