package com.nanna.sfgdi;

import com.nanna.sfgdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgdiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run ( SfgdiApplication.class , args );

		MyController cntroller = ( MyController ) context.getBean ( "myController" );

		String greeting = cntroller.sayHello ();
		System.out.println (greeting);
	}


}
