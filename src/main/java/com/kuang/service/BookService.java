/**
 *  Copyright (C), 2015-2019
 * FileName: BookService
 * Author: hanlong
 * Date: 2019/12/13 9:22 上午
 * Description:
 */
package com.kuang.service;

import com.kuang.pojo.Books;

import java.util.List;

/** Copyright (C), 2015-2019 
 * FileName: BookService 
 * Author: hanlong 
 * Date: 2019/12/13 9:22 上午 
 *Description: 
 */
//BookService：底下需要实现，调用dao 层
public interface BookService {
    //增加一本书
    int addBook(Books book);

    //根据Id 删除一个book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Books books);

    //根据id 查询，返回一个Book
    Books queryBookById(int id);

    //查询全部Book, 返回一个List 集合
    List<Books> queryAllBook();
}
