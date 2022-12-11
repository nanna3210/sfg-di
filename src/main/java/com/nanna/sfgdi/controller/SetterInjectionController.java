package com.nanna.sfgdi.controller;

import com.nanna.sfgdi.services.GreetingService;



public class SetterInjectionController {
private GreetingService greetingService;

    public void setGreetingService ( GreetingService greetingService ) {
        this.greetingService = greetingService;
    }

    public GreetingService getGreetingService ( ) {
        return greetingService;
    }
}
