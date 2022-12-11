package com.nanna.sfgdi.controller;

import com.nanna.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

   GreetingService greetingService;

    public ConstructorInjectedController ( GreetingService greetingService ) {
        this.greetingService = greetingService;
    }

    public String getGreetingService ( ) {
        return greetingService.sayGreeting ();
    }
}
