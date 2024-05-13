package com.dss.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

	public static final Logger Logger =  LoggerFactory.getLogger(SpringApplication.class);
	@Test
	void contextLoads() {
		Logger.info("It is a test class");
		assertEquals(true, true);
	}

}
