package com.lfb.dao;

import com.lfb.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
    List<User> findAll();
}
