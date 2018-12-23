package com.yl.river.controller;

import com.yl.river.controller.response.CommonResponse;
import com.yl.river.model.Book;
import com.yl.river.model.TRiverBank;
import com.yl.river.service.BookService;
import com.yl.river.service.TRiverBankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TRiverBankController {

    private static final Logger logger = LoggerFactory.getLogger(TRiverBankController.class);

    @Autowired
    TRiverBankService tRiverBankService;

    @RequestMapping(value = "/rivers", method = RequestMethod.GET)
    public ResponseEntity<?> getRivers() {
        List<TRiverBank> result = tRiverBankService.getRivers();
        return ResponseEntity.ok(CommonResponse.successResponse(result));
    }

}
