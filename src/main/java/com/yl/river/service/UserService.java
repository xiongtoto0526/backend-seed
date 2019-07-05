package com.yl.river.service;

import com.yl.river.model.SysUser;

import java.util.List;

public interface UserService {

    List<SysUser> getUsers();

    boolean canLogin(String userName, String password);

}
