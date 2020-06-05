/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.janaswamy.capp.exception;

/**
 *
 * @author janaswamya
 */
public class UserBlockedException extends Exception{

    /**
     * without error description
     */
    public UserBlockedException() {
    }
    /**
     * With error description
     * @param errD
     */
    public UserBlockedException(String errD) {
        super(errD);
    }
}
