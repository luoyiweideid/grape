package com.grape.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author : luoyiwei
 * @date : 2024-02-01 17:28
 */
@SpringBootApplication(scanBasePackages = {"com.grape.*"})
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
