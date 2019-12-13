/**
 *  Copyright (C), 2015-2019
 * FileName: Mytest
 * Author: hanlong
 * Date: 2019/12/13 10:52 上午
 * Description:
 */

import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** Copyright (C), 2015-2019 
 * FileName: Mytest 
 * Author: hanlong 
 * Date: 2019/12/13 10:52 上午 
 *Description: 
 */
public class Mytest {
    @Test
    public void test(){
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        for (Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books);
        }

    }
}
