package com.yl.river.controller;

import com.yl.river.controller.response.CommonResponse;
import com.yl.river.model.LoginResult;
import com.yl.river.model.SysUser;
import com.yl.river.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public ResponseEntity<?> getAll() {
        List<SysUser> users = userService.getUsers();
        return ResponseEntity.ok(CommonResponse.successResponse(users));
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> login(@RequestBody Object form) {
        LoginResult loginResult = new LoginResult();
        HashMap param = (HashMap) form;
        boolean isOk = userService.canLogin((String) param.get("username"), (String) param.get("password"));
        if (isOk) {
            loginResult.setCode(100);
            loginResult.setMessage("success");
            loginResult.setUser((String) param.get("username"));
        } else {
            loginResult.setCode(999);
        }
        return ResponseEntity.ok(loginResult);
    }

}
