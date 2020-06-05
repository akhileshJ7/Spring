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
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author janaswamya
 */
public class TestUserDAOSave {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        /*
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        User u = new User();
        u.setName("akhil");
        u.setPhone("4143992123");
        u.setEmail("asss@msoe.edu");
        u.setAddress("Mil");
        u.setLoginName("akhil");
        u.setPassword("akhil123");
        u.setRole(1);//Admin
        u.setLoginStatus(1);//Active
        userDAO.save(u);
        System.out.println("_____Data uploaded_____");
        */
        ContactDAO userDAO = ctx.getBean(ContactDAO.class);
        Contact u = new Contact();
        u.setName("akhil");
        u.setPhone("4143992123");
        u.setEmail("asss@msoe.edu");
        u.setAddress("Mil");
        userDAO.save(u);
    }
}
