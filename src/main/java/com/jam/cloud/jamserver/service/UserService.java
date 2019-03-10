package com.jam.cloud.jamserver.service;

import com.jam.cloud.jamserver.dao.UserDao;
import com.jam.cloud.jamserver.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;


    public User getById(Long id){
        return userDao.getById(id);
    }
}
