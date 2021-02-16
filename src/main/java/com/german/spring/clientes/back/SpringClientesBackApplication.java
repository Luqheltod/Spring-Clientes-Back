package com.german.spring.clientes.back;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.german.spring.clientes.back.mapper.PruebasMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;





@SpringBootApplication
public class SpringClientesBackApplication implements CommandLineRunner {

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PruebasMapper pruebasMapper;
	
	@Override
	public  void run(String[] args) throws Exception {
	
	
	logger.info("All users -> {}", pruebasMapper.findAll().get(0).getId());
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringClientesBackApplication.class, args);
		
	
	}

	
}
