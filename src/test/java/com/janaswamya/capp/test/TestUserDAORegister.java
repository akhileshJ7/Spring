/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.janaswamya.capp.test;

import com.janaswamy.capp.config.SpringRootConfig;
import com.janaswamy.capp.dao.ContactDAO;
import com.janaswamy.capp.dao.UserDAO;
import com.janaswamy.capp.domain.Contact;
import com.janaswamy.capp.domain.User;
import com.janaswamy.capp.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author janaswamya
 */
public class TestUserDAORegister {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        User u = new User();
        u.setName("tim");
        u.setPhone("414222123");
        u.setEmail("awqwqws@msoe.edu");
        u.setAddress("CHI");
        u.setLoginName("bim");
        u.setPassword("nim22");
        u.setRole(UserService.ROLE_ADMIN);//Admin
        u.setLoginStatus(UserService.LOGIN_STATUS_ACTIVE);//Active
        userService.register(u);
        System.out.println("_____Data Registered_____");
        
    }
}
