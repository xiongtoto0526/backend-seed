package com.yl.river.controller;
import com.yl.river.controller.response.CommonResponse;
import com.yl.river.model.Book;
import com.yl.river.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class BookController {

    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public ResponseEntity<?> getBooks(int id) {
        Book result = bookService.getOneBook(id);
        return ResponseEntity.ok(CommonResponse.successResponse(result));
    }

}
