package com.ayh.Assignment1;

import com.ayh.Assignment1.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Assignment1Application {

	@Autowired
	ContactRepository contactRepo;

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
	}

}
