package com.wkk.dao;

import com.wkk.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * @Time: 19-11-30下午5:04
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class BookDaoTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookDao bookDao;

    @Test
    public void queryById() {
        long id = 1;
        Book book = bookDao.queryById(id);
        System.out.println("书名: "+ book.getName() + " 数量: " +book.getNumber() + "　描述: "+  book.getDetail());

    }

    @Test
    public void queryAll() {
        List<Book> books = bookDao.queryAll(10, 5);
        for (Book book : books) {
            System.out.print("书名: " + book.getName() +" 描述: "+ book.getDetail()+ " 数量: " + book.getNumber());
            System.out.println();

        }


    }

    @Test
    public void addBook() {
        for(int i =10; i<15; i++){
            Random random = new Random();
            Book book = new Book();
            book.setBook_id(i);
            book.setName("测试" + i);
            book.setNumber(random.nextInt(100));
            book.setDetail("测试, 无需描述" + i) ;
            int num = bookDao.addBook(book);
//            int num = bookDao.addBook(book);
//            System.out.println(num);
        }
    }

    @Test
    public void updateBook() {
        long book_id = 6;
        Book book = new Book();
        book.setName("设计模式");
        book.setNumber(512);
        book.setBook_id(book_id);
        book.setDetail("必看书籍");
        int num = bookDao.updateBook(book);
        System.out.println("更新成功");
//        System.out.println(num);
    }

    @Test
    public void deleteBook() {
        long id = 6;
        bookDao.deleteBookById(id);
        System.out.printf("删除id=%d的图书成功", id);
    }
}