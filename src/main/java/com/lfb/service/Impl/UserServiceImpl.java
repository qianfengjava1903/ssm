package com.lfb.service.Impl;

import com.lfb.dao.UserDao;
import com.lfb.entity.User;
import com.lfb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
