package com.grape.order.controller;

import com.grape.order.service.OrderService;
import com.grape.order.vo.req.OrderReq;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单管理
 *
 * @author : luoyiwei
 * @date : 2024-06-13 10:59
 */
@RestController
@AllArgsConstructor
@RequestMapping("/order")
public class OrderController {


    private final OrderService orderService;


    /**
     * 下单
     *
     * @param req 订单请求
     */
    @PostMapping
    public void saveOrder(@RequestBody OrderReq req) {
        orderService.saveOrder(req);
    }

}
