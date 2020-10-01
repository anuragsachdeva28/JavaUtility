package com.utilitynewgen.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


@SpringBootApplication
@EnableScheduling
public class JavaUtilityNewgenApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaUtilityNewgenApplication.class, args);
		printthis();
	}
	@Scheduled(fixedRate = 1000)
	static void printthis() {
		System.out.println("I am printing this");#Print
	}

}
