package com.wkk.service.impl;

import com.wkk.dao.BookDao;
import com.wkk.entity.Book;
import com.wkk.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Time: 19-11-30下午9:46
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public int deleteBook(long id) {
        return bookDao.deleteBookById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public Book getById(long id) {
        return bookDao.queryById(id);
    }

    @Override
    public List<Book> getList(int start, int pageNum) {
        return  bookDao.queryAll(start, pageNum);
    }
}
