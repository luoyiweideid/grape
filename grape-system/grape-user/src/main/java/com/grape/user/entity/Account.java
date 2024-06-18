package com.grape.user.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 账号
 *
 * @author : luoyiwei
 * @date : 2024-06-11 16:50
 */
@Data
public class Account implements Serializable {
    /**
     * 主键id
     */
    private Long id;
    /**
     * 账号名
     */
    private String name;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 身份证
     */
    private String idCard;
    /**
     * 状态
     */
    private String state;

}
