package com.lfb.service;

import com.lfb.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    List<User> findAll();
}
