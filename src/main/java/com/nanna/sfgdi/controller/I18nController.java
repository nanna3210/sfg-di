package com.nanna.sfgdi.controller;

import com.nanna.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {


    private final GreetingService greetingService;


    public I18nController ( @Qualifier("i18nservice") GreetingService greetingService ) {
        this.greetingService = greetingService;
    }
    public String sayHello() {
        return greetingService.sayGreeting ();
    }


}
