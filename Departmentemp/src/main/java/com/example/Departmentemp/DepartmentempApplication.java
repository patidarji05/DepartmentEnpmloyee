package com.example.Departmentemp;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartmentempApplication {
	
	private static Logger log= LoggerFactory.getLogger(DepartmentempApplication.class);
	

	    @Value("${server.port}")
	    private int serverPort;


	public static void main(String[] args) {
		
		SpringApplication.run(DepartmentempApplication.class, args);
		
		log.debug("this is debug info");
		log.info("this is application info");
		log.warn("this is warning error");
		log.error("this is error of logger");
	}
	
	 @PostConstruct
	    public void init() {
	      
	        System.out.println("Server Port: " + serverPort);
	    }

}
