package com.grape.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author : luoyiwei
 * @date : 2024-06-13 10:28
 */
@SpringBootApplication(scanBasePackages = {"com.grape.*"})
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}
