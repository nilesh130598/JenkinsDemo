package com.practiceApp.Controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.practiceApp")
public class BasicBankAppApplication {
	@Autowired
	DataSource datasource;
	public static void main(String[] args) {
		SpringApplication.run(BasicBankAppApplication.class, args);
	}

}
