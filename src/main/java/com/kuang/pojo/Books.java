/**
 *  Copyright (C), 2015-2019
 * FileName: Books
 * Author: hanlong
 * Date: 2019/12/12 5:21 下午
 * Description:
 */
package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Copyright (C), 2015-2019 
 * FileName: Books 
 * Author: hanlong 
 * Date: 2019/12/12 5:21 下午 
 *Description: 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
