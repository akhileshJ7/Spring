/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.janaswamy.capp.util;

/**
 * This class contains utility method for String
 * @author janaswamya
 */
public class StringUtil {
    public static String toCommaSeparatedString(Object[] items){
        StringBuilder sb = new StringBuilder();
        for(Object item: items){
            sb.append(item).append(",");
        }
        if(sb.length()>0){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}
