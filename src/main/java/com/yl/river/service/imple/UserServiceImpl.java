package com.yl.river.service.imple;

import com.yl.river.config.ErrorCode;
import com.yl.river.mapper.SysUserMapper;
import com.yl.river.model.SysUser;
import com.yl.river.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    SysUserMapper userMapper;

    @Override
    public List<SysUser> getUsers() {
        return userMapper.selectAll();
    }

    @Override
    public boolean canLogin(String userName, String password) {
        List<SysUser> result = userMapper.isValidUser(userName, password);
        return result.size() > 0;
    }
}
