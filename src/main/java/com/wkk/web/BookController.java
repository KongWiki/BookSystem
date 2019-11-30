package com.wkk.web;

import com.wkk.entity.Book;
import com.wkk.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Time: 19-11-30下午9:57
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
@Controller
@RequestMapping("/book")
public class BookController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private String list(Model model) {
        List<Book> books = bookService.getList(0, 1000);
        model.addAttribute("list", books);
        return "list"; // WEB-INF/jsp/list.jsp
    }

    @RequestMapping(value = "/detail/{book_id}", method = RequestMethod.GET)
    private String detail(@PathVariable("book_id") Long book_id, Model model) {
        Book book = bookService.getById(book_id);
        model.addAttribute("book", book);
        return "detail";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "text/plain;charset=utf-8")
    @ResponseBody
    private String add(Book book) {
        Book hasBooks = bookService.getById(book.getBook_id());
        int i = -2;
        if (hasBooks == null) {
            i = bookService.addBook(book);
        }
        return i > 0 ? "success" : "error";

    }

    @RequestMapping(value = "/del/{bookId}", method = RequestMethod.POST)
    @ResponseBody
    private String deleteBookById(@PathVariable("book_id") Long id) {
        int i = bookService.deleteBook(id);
        return i > 0 ? "success" : "error";
    }
}

