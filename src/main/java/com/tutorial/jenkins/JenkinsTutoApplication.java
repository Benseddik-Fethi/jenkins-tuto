package com.tutorial.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

/**
 * @author Fethi-pc
 */
@SpringBootApplication
public class JenkinsTutoApplication {

    public static Logger logger = LoggerFactory.getLogger(JenkinsTutoApplication.class);

    @PostConstruct
    public void init(){
        logger.info("Application demarré....");
    }

    public static void main(String[] args) {
        logger.info("Application demarré....");
        SpringApplication.run(JenkinsTutoApplication.class, args);
    }

}
