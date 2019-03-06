package com.xrb.annotation;

import org.springframework.stereotype.Repository;

/**
 * @author xieren8iao
 * @create 2019/3/6 - 14:46
 */
@Repository
public class UserDaoImpl implements  UserDao {
    @Override
    public void save() {
        System.out.println("userDao...save...");

    }
}
