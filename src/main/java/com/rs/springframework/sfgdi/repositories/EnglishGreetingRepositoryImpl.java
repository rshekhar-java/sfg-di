package com.rs.springframework.sfgdi.repositories;

/**
 * created by rs 12/22/2021.
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World from  - EN from EnglishGreetingRepository";
    }
}
