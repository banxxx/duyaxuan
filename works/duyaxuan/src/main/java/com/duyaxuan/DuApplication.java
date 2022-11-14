package com.duyaxuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.vt.exam.api.mapper")
@EnableScheduling
@SpringBootApplication
public class DuApplication {

    public static void main(String[] args) {
        SpringApplication.run(DuApplication.class, args);
    }

}