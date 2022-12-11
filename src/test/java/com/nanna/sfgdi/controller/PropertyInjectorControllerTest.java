package com.nanna.sfgdi.controller;

import com.nanna.sfgdi.services.GreetingService;
import com.nanna.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectorControllerTest {

    PropertyInjectorController controller;


    @BeforeEach
    void setUp() {
        controller = new PropertyInjectorController ();
        controller.greetingService = new GreetingServiceImpl ();
    }

    @Test
    void getGreetingService ( ) {
        System.out.println (controller.getGreetingService ());
    }
}