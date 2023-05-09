package com.testeldap;

import com.testeldap.ldap.data.repository.User;
import com.testeldap.ldap.data.repository.UserRepository;
import com.testeldap.ldap.data.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TesteldapApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteldapApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void teste() {
		System.out.println(userRepository.findAll());
	}



}
