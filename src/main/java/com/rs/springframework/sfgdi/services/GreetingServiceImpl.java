package com.rs.springframework.sfgdi.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World From Greeting Service Impl !";
    }
}
