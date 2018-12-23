package com.yl.river.service;


import com.yl.river.Application;
import com.yl.river.model.Book;
import com.yl.river.model.vo.BookVO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("local")
public class BookServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(BookServiceTest.class);

    @Autowired
    BookService bookService;

    @Before
    public void before() {
        logger.debug("do some thing before test here...");
    }

    @Test
    public void testBookGet() {
        BookVO book = bookService.getOneBook(1);
        logger.debug("book code : {}", book.getCode());
    }

    @After
    public void after() {
        logger.debug("do some thing after test here...");
    }
}
