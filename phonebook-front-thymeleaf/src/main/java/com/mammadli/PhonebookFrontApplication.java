package com.mammadli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PhonebookFrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhonebookFrontApplication.class, args);
    }

}