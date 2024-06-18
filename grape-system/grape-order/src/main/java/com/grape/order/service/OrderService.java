package com.grape.order.service;

import com.grape.order.entity.FinanceOrder;
import com.grape.order.repository.OrderRepository;
import com.grape.order.util.CodeGenerate;
import com.grape.order.vo.req.OrderReq;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 订单 - Service
 *
 * @author : luoyiwei
 * @date : 2024-06-13 11:20
 */
@Service
@AllArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;


    /**
     * 保存订单
     *
     * @param req 前端参数
     */
    public void saveOrder(OrderReq req) {
        FinanceOrder financeOrder = new FinanceOrder();
        financeOrder.setCode(CodeGenerate.generateOrderNumber(""));
        financeOrder.setType(req.getType());
        financeOrder.setTargetId(req.getTargetId());
        financeOrder.setAmount(req.getAmount());
        financeOrder.setStatus("WAIT");
        financeOrder.setRemark(req.getRemark());
        orderRepository.save(financeOrder);
    }

}
