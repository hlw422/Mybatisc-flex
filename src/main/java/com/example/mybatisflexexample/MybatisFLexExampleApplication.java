package com.example.mybatisflexexample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatisflexexample.mapper")
public class MybatisFLexExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisFLexExampleApplication.class, args);
    }

}
