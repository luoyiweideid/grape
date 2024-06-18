package com.grape.order.vo.req;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 下单请求实体
 *
 * @author : luoyiwei
 * @date : 2024-06-13 11:07
 */
@Data
public class OrderReq implements Serializable {
    /**
     * 订单类型
     */
    private String type = "NORMAL";
    /**
     * 订单目标id
     */
    private Long targetId;
    /**
     * 订单金额
     */
    private BigDecimal amount = BigDecimal.ZERO;
    /**
     * 订单备注
     */
    private String remark;

}
