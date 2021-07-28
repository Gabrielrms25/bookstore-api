package com.ramos.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ramos.bookstore.service.DBService;

@SpringBootApplication
public class BookstoreApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	
}
