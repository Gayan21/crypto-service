package com.example.ethaxcryptoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class EthanCryptoServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EthanCryptoServiceApplication.class, args);
    }
}
