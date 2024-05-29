package com.example.fitness;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.time.LocalDate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

/*	@Bean
	CommandLineRunner runner(){
		return args -> {

			Users Users1 = new Users(1, "A", "aa", "AAA", "2000-01-01", "a@gmail.com", "0111111111", LocalDate.parse("2020-01-01"));
		};
	}*/

}

