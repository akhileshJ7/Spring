/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.janaswamya.capp.test;

import com.janaswamy.capp.config.SpringRootConfig;
import com.janaswamy.capp.dao.UserDAO;
import com.janaswamy.capp.domain.Contact;
import com.janaswamy.capp.domain.User;
import com.janaswamy.capp.service.ContactService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author janaswamya
 */
public class TestUserDAODelete {
    public static void main(String[] args){
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        /*
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        userDAO.delete(2);
        System.out.println("_____Data Deleted_____");
        */
        ContactService contactService = ctx.getBean(ContactService.class);
        Contact  c = new Contact();
   
        Integer[] id = {1,2};
        contactService.delete(id);
        
    }
}
