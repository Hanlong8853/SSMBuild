/**
 *  Copyright (C), 2015-2019
 * FileName: BookController
 * Author: hanlong
 * Date: 2019/12/13 10:12 上午
 * Description:
 */
package com.kuang.controller;

import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/** Copyright (C), 2015-2019 
 * FileName: BookController 
 * Author: hanlong 
 * Date: 2019/12/13 10:12 上午 
 *Description: 
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model)
    {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";

    }

    //添加书籍
    @RequestMapping("/toAddBook")
    public String toAddPaper()
    {
        return "addBook";
    }
    @RequestMapping("/addBook")
    public String addPaper(Books books)
    {
        System.out.println(books);
        bookService.addBook(books);
        return "redirect:/book/allBook";

    }
    //添加修改书籍的请求
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model ,int id)
    {
        Books books = bookService.queryBookById(id);
        System.out.println(books);
        model.addAttribute("Qbook",books);
        return "updateBook";
    }
    @RequestMapping("/updateBook")
    public String updateBook(Model model,Books book)
    {
        System.out.println(book);
        bookService.updateBook(book);
        Books books = bookService.queryBookById(book.getBookID());
        model.addAttribute("books",books);
        return "redirect:/book/allBook";

    }
    // 删除
    @RequestMapping("/del/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id)
    {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";

    }





}
