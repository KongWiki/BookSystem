package com.wkk.service;

import com.wkk.dao.BookDao;
import com.wkk.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Time: 19-11-30下午9:30
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void addBook() {

    }

    @Test
    public void deleteBook() {
    }

    @Test
    public void updateBook() {
    }

    @Test
    public void getById() {
        long id = 1;
        Book book = bookService.getById(id);
        System.out.println("书名: " + book.getName() + " 数量: " + book.getNumber() + " 描述: " + book.getDetail());
    }

    @Test
    public void getList() {
    }
}