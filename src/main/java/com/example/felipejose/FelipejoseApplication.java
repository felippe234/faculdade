package com.example.felipejose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class FelipejoseApplication {

	public static void main(String[] args) {
		SpringApplication.run(FelipejoseApplication.class, args);
	}

}
