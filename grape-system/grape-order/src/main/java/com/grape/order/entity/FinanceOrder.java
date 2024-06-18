package com.grape.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 订单表
 *
 * @author : luoyiwei
 * @date : 2024-06-13 10:22
 */
@Data
@TableName("finance_order")
public class FinanceOrder {
    /**
     * 主键id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
     * 订单编号
     */
    @TableField("code")
    private String code;
    /**
     * 订单类型
     */
    @TableField("order_type")
    private String type;
    /**
     * 订单目标id
     */
    @TableField("target_id")
    private Long targetId;
    /**
     * 订单金额
     */
    @TableField("amount")
    private BigDecimal amount;
    /**
     * 订单状态
     */
    @TableField("status")
    private String status;
    /**
     * 订单备注
     */
    @TableField("remark")
    private String remark;
}
