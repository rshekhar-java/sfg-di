package com.rs.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * created by rs 12/23/2021.
 */
@Component
public class SingletonBean {

    public SingletonBean(){
        System.out.println("Creating a Singelton Bean !!!");
    }
    public String getMyScope(){
        return "I'm a Singelton";
    }
}
