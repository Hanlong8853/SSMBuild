/**
 *  Copyright (C), 2015-2019
 * FileName: BookMapper
 * Author: hanlong
 * Date: 2019/12/12 5:24 下午
 * Description:
 */
package com.kuang.dao;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/** Copyright (C), 2015-2019 
 * FileName: BookMapper 
 * Author: hanlong 
 * Date: 2019/12/12 5:24 下午 
 *Description: 
 */
public interface BookMapper {
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
