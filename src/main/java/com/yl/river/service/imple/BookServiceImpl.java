package com.yl.river.service.imple;

import com.yl.river.config.ErrorCode;
import com.yl.river.exception.BookException;
import com.yl.river.service.BookService;
import com.yl.river.model.vo.BookVO;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public BookVO getOneBook(int id) {
        if (id < -1) {
            throw new BookException(ErrorCode.PARAM_TOO_LONG.getCode(), ErrorCode.PARAM_TOO_LONG.getMsg());
        }
        return new BookVO(1L, "西游记", "001");
    }

}
