/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.janaswamy.capp.service;

import com.janaswamy.capp.domain.Contact;
import java.util.List;


/**
 * interface with all business operation for contact entity
 * @author janaswamya
 */
public interface ContactService {
    
    /**
     * Method handles to save contact
     * @param u 
     */
    public void save(Contact c);
    /**
     * method to update contact
     * @param c 
     */
    public void update(Contact c);
    /**
     * method to delete contact by contact id 
     * @param contactId 
     */
    public void delete(Integer contactId);
    /**
     * method to delete multiple contacts 
     * @param contactIds 
     */
    public void delete(Integer[] contactIds);
    
    /**
     * 
     */
    public Contact findById(Integer contactId);
    
    /**
     * Returns all the User Contact(logged in user)
     * @param userId
     * @return 
     */
    public List<Contact> findUserContact(Integer userId);
    
    /**
     * Search contact for user based n given text 
     * @param userId 
     * @param txt
     * @return 
     */
    public List<Contact> findUserContact(Integer userId, String txt);
    
    
    
}
