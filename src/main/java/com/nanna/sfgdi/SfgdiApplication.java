package com.nanna.sfgdi;

import com.nanna.sfgdi.controller.I18nController;
import com.nanna.sfgdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgdiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run ( SfgdiApplication.class , args );
//		getting the contxt
		MyController cntroller = ( MyController ) context.getBean ( "myController" );
		I18nController i18nController = ( I18nController ) context.getBean ( "i18nController" );
		System.out.println (i18nController.sayHello ());


		//		String greeting = cntroller.sayHello ();
//		System.out.println (greeting);
	}


}
