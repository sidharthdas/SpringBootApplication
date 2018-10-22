package com.sid;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.sid.repository")
@ComponentScan("com.sid.service")
@ComponentScan("com.sid.serviceImpl")
@EnableJpaRepositories("com.sid.repository")
@ComponentScan("com.sid.controller")
@EntityScan("com.sid.model")
public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(MainApplication.class, args);

	}

}

