package com.yl.river.exception;


import com.yl.river.controller.response.CommonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RuntimeExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(RuntimeExceptionHandler.class);

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(BookException.class)
    @ResponseBody
    public CommonResponse handleBookException(BookException e) {
        logger.error("book exception", e);
        return new CommonResponse(e.getCode(), e.getMessage());
    }


}
