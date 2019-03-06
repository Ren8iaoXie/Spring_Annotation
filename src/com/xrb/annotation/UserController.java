package com.xrb.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author xieren8iao
 * @create 2019/3/6 - 14:51
 */
@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    public void save(){
        this.userService.save();
        System.out.println("userController...run...");
    }
}

