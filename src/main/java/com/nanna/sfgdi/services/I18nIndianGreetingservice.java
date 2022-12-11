package com.nanna.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile ( "IN" )
@Service("i18nservice")
public class I18nIndianGreetingservice implements GreetingService{

    @Override
    public String sayGreeting ( ) {
        return "namaste Developers";
    }
}
