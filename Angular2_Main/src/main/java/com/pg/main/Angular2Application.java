package com.pg.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.pg.contrlr"})
public class Angular2Application {

	public static void main(String[] args) {
		SpringApplication.run(Angular2Application.class, args);
	}
}
