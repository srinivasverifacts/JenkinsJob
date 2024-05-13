package com.dss.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {

	public static final Logger Logger =  LoggerFactory.getLogger(SpringApplication.class);
	public static void main(String[] args) {
		
		Logger.info("It is contineous Integration Job");
		SpringApplication.run(SpringbootApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Logger.info("It is my Second Logger");
	}

}
