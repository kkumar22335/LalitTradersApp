package com.hicorp.LalitTradersApp.AppStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * @author Krishna Khatana
 *
 */
@Configuration
@ComponentScan
@SpringBootApplication
public class LalitTradersApplication {

	public static void main(String[] args) {
		SpringApplication.run(LalitTradersApplication.class, args);
	}
}
