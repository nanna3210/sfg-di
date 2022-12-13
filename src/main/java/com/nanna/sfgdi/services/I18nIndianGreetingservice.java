package com.nanna.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile ( {"IN", "default"} )
@Service("i18nservice")
public class I18nIndianGreetingservice implements GreetingService{


//    implementing methods of greetingServices;
    @Override
    public String sayGreeting ( ) {
        return "namaste Developers";
    }
}
