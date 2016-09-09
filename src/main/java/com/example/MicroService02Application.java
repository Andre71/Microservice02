package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MicroService02Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroService02Application.class, args);
	}
}

@RestController
class LogController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @RequestMapping("/")
    String logInfo(){
        
    	logger.debug("This is a debug message in MicroService-01");
        logger.info("This is an info message in MicroService-01");
        logger.warn("This is a warn message in MicroService-01");
        logger.error("This is an error message in MicroService-01");
        
        new SpringLoggingHelper().helpMethod();
        
        return "logInfo02";
    }
}   