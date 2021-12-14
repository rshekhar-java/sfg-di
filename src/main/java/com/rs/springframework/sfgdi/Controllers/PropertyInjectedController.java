package com.rs.springframework.sfgdi.Controllers;

import com.rs.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreetings();
    }
}
