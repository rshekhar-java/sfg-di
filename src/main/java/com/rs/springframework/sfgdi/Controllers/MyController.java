package com.rs.springframework.sfgdi.Controllers;

import org.springframework.stereotype.Controller;


@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello Spring Context !!");
        return "Hi All !";
    }
}
