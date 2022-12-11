package com.nanna.sfgdi.controller;

import com.nanna.sfgdi.services.GreetingService;

public class PropertyInjectorController {
    public GreetingService greetingService;

    public String getGreetingService() {
        return  greetingService.sayGreeting ();
    }

}
