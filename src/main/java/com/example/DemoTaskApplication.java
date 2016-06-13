package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@EnableTask
public class DemoTaskApplication {

    @Bean
    CommandLineRunner runner() {
        return args -> {
            System.out.println("Hello World! (" + new Date() + ")");
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoTaskApplication.class, args);
    }
}
