/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.janaswamya.capp.test;

import com.janaswamy.capp.config.SpringRootConfig;
import com.janaswamy.capp.dao.UserDAO;
import com.janaswamy.capp.domain.User;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author janaswamya
 */
public class TestUserDAOFindByProperty {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        List<User> users = userDAO.findByProperty("name", "Akhilesh");
        for(User u: users){
            System.out.println(u.getUserId()+" "+u.getName()+" "+u.getRole());
        }
   
    }
}
