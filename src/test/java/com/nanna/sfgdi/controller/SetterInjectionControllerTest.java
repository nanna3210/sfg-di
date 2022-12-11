package com.nanna.sfgdi.controller;

import com.nanna.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectionControllerTest {

    SetterInjectionController controller;
    @BeforeEach
    void setUp ( ) {
        controller = new SetterInjectionController ();
        controller.setGreetingService ( new GreetingServiceImpl () );
    }

    @Test
    void getGreetingService ( ) {
        System.out.println (controller.getGreetingService ());
    }
}