package com.tracoda;

import com.tracoda.controller.FilesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


//@SpringBootApplication
@SpringBootApplication(scanBasePackages={
        "com.tracoda.controller", "com.tracoda.interfaces", "com.tracoda.model", "com.tracoda.rest", "com.tracoda.tracoda"})
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

    @Bean
    public FilesController filesController(){
        return new FilesController();
    }

}
