package com.nefu.test01.test1.service.impl;


import com.nefu.test01.pojo.User;
import com.nefu.test01.test1.mapper.UserMapper;
import com.nefu.test01.test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
