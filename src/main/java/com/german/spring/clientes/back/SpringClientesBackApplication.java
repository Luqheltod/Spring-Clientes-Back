package com.german.spring.clientes.back;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;





@SpringBootApplication
public class SpringClientesBackApplication implements CommandLineRunner {

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	
	@Override
	public  void run(String[] args) throws Exception {
	
	
	
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringClientesBackApplication.class, args);
		
	
	}

	
}
