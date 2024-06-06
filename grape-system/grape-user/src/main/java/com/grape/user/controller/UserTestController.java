package com.grape.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 测试接口
 *
 * @author : luoyiwei
 * @date : 2024-02-01 18:18
 */
@RestController
@RequestMapping("/user/test")
public class UserTestController {

    /**
     * 测试接口
     *
     * @param value 测试参数
     * @return 测试结果
     */
    @GetMapping("/{value}")
    public String test(@PathVariable("value") String value) {
        return value;
    }
}
