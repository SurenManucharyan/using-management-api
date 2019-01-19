package com.management.system;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ManagementSystemApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(ManagementSystemApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ManagementSystemApplication.class);
    }
}