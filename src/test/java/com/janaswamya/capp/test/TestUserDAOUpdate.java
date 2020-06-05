/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.janaswamya.capp.test;

import com.janaswamy.capp.config.SpringRootConfig;
import com.janaswamy.capp.dao.UserDAO;
import com.janaswamy.capp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author janaswamya
 */
public class TestUserDAOUpdate {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        
        
        User u = new User();
        u.setUserId(2);
        u.setName("Akhilesh");
        u.setPhone("4143992123");
        u.setEmail("asss@msoe.edu");
        u.setAddress("Mil");
        u.setRole(1);//Admin
        u.setLoginStatus(1);//Active
        userDAO.update(u);
        System.out.println("_____Data updated_____");
    }
}
