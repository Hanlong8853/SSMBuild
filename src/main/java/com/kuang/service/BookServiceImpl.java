/**
 *  Copyright (C), 2015-2019
 * FileName: BookServiceImpl
 * Author: hanlong
 * Date: 2019/12/13 9:24 上午
 * Description:
 */
package com.kuang.service;

import com.kuang.dao.BookMapper;
import com.kuang.pojo.Books;

import java.util.List;

/** Copyright (C), 2015-2019 
 * FileName: BookServiceImpl 
 * Author: hanlong 
 * Date: 2019/12/13 9:24 上午 
 *Description: 
 */
public class BookServiceImpl implements BookService {

    //调用dao 层的操作，设置一个set 接口，方便Spring管理
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
