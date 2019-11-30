package com.wkk.dao;

import com.wkk.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Time: 19-11-30下午4:03
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public interface BookDao {
    /**
     * 用于数据库数据的操作
     * 主要是与数据库进行交互
     */

    /**
     * 根据id查询书籍信息
     */
    Book queryById(long id);

    /**
     * 查询所有信息
     */
    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 添加书籍
     */
    int addBook(Book book);


    /**
     * 更新书籍
     */
    int updateBook(Book book);



    /**
     * 删除书籍
     */
    int deleteBook(long id);
}
