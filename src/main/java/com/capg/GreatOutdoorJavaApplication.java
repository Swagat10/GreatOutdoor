package com.capg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capg.dao.RetailerDAOImpl;

@SpringBootApplication
public class GreatOutdoorJavaApplication implements CommandLineRunner {

	@Autowired
	RetailerDAOImpl addressdao;
	public static void main(String[] args) {
		SpringApplication.run(GreatOutdoorJavaApplication.class, args);
	}
	
	public void run(String... args) throws Exception{
		
	}

}
