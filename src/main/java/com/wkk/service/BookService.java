package com.wkk.service;

import com.wkk.entity.Book;

import java.util.List;

/**
 * @Time: 19-11-30下午9:14
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public interface BookService {
    /**
     * 用户角度出发
     * @return
     */
    int addBook(Book book);
    int deleteBook(long id);
    int updateBook(Book book);
    Book getById(long id);
    List<Book> getList(int start, int pageNum);

}
