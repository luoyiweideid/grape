package com.grape.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : luoyiwei
 * @date : 2024-02-01 17:28
 */
@SpringBootApplication(scanBasePackages = {"com.grape.*"})
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
