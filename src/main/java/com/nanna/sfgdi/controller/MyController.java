package com.nanna.sfgdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {


    public String sayHello (){
        System.out.println ("hello World");
        return "hi folks";



    }
}
