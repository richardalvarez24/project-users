package com.panel.users.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.panel.users.core.repository.UserRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class PanelBackUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(PanelBackUsersApplication.class, args);
	}

}
