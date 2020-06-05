
package com.janaswamy.capp.dao;

import com.janaswamy.capp.domain.Contact;
import java.util.List;

/**
 *
 * @author janaswamya
 */
public interface ContactDAO {
    
    public void save(Contact c);
    public void update(Contact c);
    public void delete(Contact c);
    public void delete(Integer contactId);
    public Contact findById(Integer contactId);
    public List<Contact> findAll();
    public List<Contact> findByProperty(String propName,Object propValue);
   
}
