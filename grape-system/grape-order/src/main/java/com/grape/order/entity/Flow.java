package com.grape.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 支付流水
 *
 * @author : luoyiwei
 * @date : 2024-06-13 10:38
 */
@Data
@TableName("flow")
public class Flow {
    /**
     * 主键id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
     * 订单id
     */
    @TableField("order_id")
    private Long orderId;
    /**
     * 支付方式
     */
    @TableField("pay_type")
    private String payType;
    /**
     * 支付状态
     */
    @TableField("status")
    private String status;
    /**
     * 支付金额
     */
    @TableField("pay_amount")
    private String payAmount;
    /**
     * 支付时间
     */
    @TableField("pay_time")
    private String payTime;
    /**
     * 支付流水号
     */
    @TableField("flow_no")
    private String flowNo;


}
