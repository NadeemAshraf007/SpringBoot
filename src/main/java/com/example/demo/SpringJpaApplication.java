package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*
 * @ComponentScan(basePackages =
 * {"com.example.demo","com.example.demo.controller",
 * "com.example.service","com.example.demo.dao","com.example.demo.entity"})
 */
public class SpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

}
