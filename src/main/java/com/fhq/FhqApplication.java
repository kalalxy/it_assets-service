package com.fhq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fhq.dao")
public class FhqApplication {

    public static void main(String[] args) {
        SpringApplication.run(FhqApplication.class, args);
    }

}

