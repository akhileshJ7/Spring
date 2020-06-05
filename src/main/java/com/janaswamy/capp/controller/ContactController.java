
package com.janaswamy.capp.controller;

import com.janaswamy.capp.command.LoginCommand;
import com.janaswamy.capp.command.UserCommand;
import com.janaswamy.capp.domain.Contact;
import com.janaswamy.capp.domain.User;
import com.janaswamy.capp.exception.UserBlockedException;
import com.janaswamy.capp.service.ContactService;
import com.janaswamy.capp.service.UserService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author janaswamya
 */
@Controller
public class ContactController {
    
    @Autowired
    private ContactService contactService;
    
    @RequestMapping(value="/user/contact_form")
    public String contactForm(Model m){
        Contact contact = new Contact();
        m.addAttribute("command", contact);
        return "contact_form"; //jsp
    }
    
    

    @RequestMapping(value="/user/save_contact")
    public String contactSaveOrUpdate(@ModelAttribute("command") Contact contact, Model m, HttpSession session){
        Integer contactId = (Integer) session.getAttribute("aContactId");
        if(contactId==null){
            //Save
            try {
            Integer userId = (Integer) session.getAttribute("userId");
            contact.setUserId(userId);
            contactService.save(contact);
            return "redirect:clist?act=sv"; //jsp
        } catch (Exception ex) {
            ex.printStackTrace();
            m.addAttribute("err"," Failed to Save Contact");
             return "contact_form";
        }   
        }else{
            //update
            try {
                contact.setContactId(contactId);
                contactService.update(contact);
                session.removeAttribute("aContactId");
                return "redirect:clist?act=ed"; //jsp
        } catch (Exception ex) {
            ex.printStackTrace();
            m.addAttribute("err"," Failed to Edit Contact");
             return "contact_form";
        }  
        }
    
     }     
    @RequestMapping(value="/user/clist")
    public String contactList(Model m, HttpSession session){
        Integer userId = (Integer) session.getAttribute("userId");
        m.addAttribute("contactList", contactService.findUserContact(userId));
        return "clist";//JSP
    }
    
    @RequestMapping(value="/user/contact_search")
    public String contactSearch(Model m, HttpSession session, @RequestParam("freeText") String freeText){
        Integer userId = (Integer) session.getAttribute("userId");
        m.addAttribute("contactList", contactService.findUserContact(userId, freeText));
        return "clist";//JSP
    }
    
    
    @RequestMapping(value="/user/del_contact")
    public String contactDelete(@RequestParam("cid") Integer contactId){
        contactService.delete(contactId);
        return "redirect:clist?act=del";
    }
    
    @RequestMapping(value="/user/edit_contact")
    public String prepareEditForm(Model m, HttpSession session, @RequestParam("cid") Integer contactId){
        session.setAttribute("aContactId", contactId);
        Contact c = contactService.findById(contactId);
        m.addAttribute("command", c);
        return "contact_form"; //jsp
    }
    
}
