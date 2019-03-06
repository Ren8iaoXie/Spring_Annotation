package com.xrb.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xieren8iao
 * @create 2019/3/6 - 14:55
 */
public class AnnotationTest {
    @Test
    public void test(){
        String path="com/xrb/annotation/applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(path);
        UserController userController=applicationContext.getBean(UserController.class);
        userController.save();
    }
}
