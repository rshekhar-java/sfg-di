package com.rs.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreetings() {
        return "Hello World From Property Injected Greeting Service !";
    }
}
