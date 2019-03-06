package com.xrb.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xieren8iao
 * @create 2019/3/6 - 14:49
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public void save() {
        this.userDao.save();
        System.out.println("userService..run...");
    }
}
