package com.nanna.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile ( "EN" )
@Service("i18nservice")
public class I18nEnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting ( ) {
        return "Hello Developers";

    }


}
