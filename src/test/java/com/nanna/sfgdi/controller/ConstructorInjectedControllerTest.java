package com.nanna.sfgdi.controller;

import com.nanna.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;
    @BeforeEach
    void setUp ( ) {
        controller = new ConstructorInjectedController ( new GreetingServiceImpl () );
    }

    @Test
    void getGreetingService ( ) {
        System.out.println (controller.getGreetingService ());
    }
}