package com.huice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huice.dao.*")
public class DbmoveApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbmoveApplication.class, args);
    }

}
