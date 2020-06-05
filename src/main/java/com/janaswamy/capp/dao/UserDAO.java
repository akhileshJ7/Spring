
package com.janaswamy.capp.dao;

import com.janaswamy.capp.domain.User;
import java.util.List;
/**
 *
 * @author janaswamya
 */
public interface UserDAO {
    public void save(User u);
    public void update(User u);
    public void delete(User u);
    public void delete(Integer userId);
    public User findById(Integer userId);
    public List<User> findAll();
    public List<User> findByProperty(String propName,Object propValue);
    
    
}
