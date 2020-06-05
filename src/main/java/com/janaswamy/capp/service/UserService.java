/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.janaswamy.capp.service;

import com.janaswamy.capp.domain.User;
import com.janaswamy.capp.exception.UserBlockedException;
import java.util.List;

/**
 * 
 * @author janaswamya
 */
public interface UserService {
    public static final Integer LOGIN_STATUS_ACTIVE =1;
    public static final Integer LOGIN_STATUS_BLOCKED =2;
    
    public static final Integer ROLE_ADMIN =1;
    public static final Integer ROLE_USER  =2;
    /**
     * Method handles user registration
     * @param u 
     */
    public void register(User u);
    /**
     * Login operation using given credentials, it returns User object
     * when success else null
     * Exception when user is blocked
     * @param loginName
     * @param password
     * @return 
     * @throws com.janaswamy.capp.exception.UserBlockedException 
     */
    public User login(String loginName, String password) throws UserBlockedException;
    
    /**
     * get list of registered users
     * @return 
     */
    public List<User> getUserList();
    
    /**
     * Change login status
     * @param userId
     * @param loginstatu 
     */
    public void changeLoginStatus(Integer userId, Integer loginStatus);
    
    /**
     * 
     * @param username
     * @return 
     */
    public Boolean checkUsername(String username);
   
}
