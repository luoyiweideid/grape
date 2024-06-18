package com.grape.order.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.grape.order.entity.FinanceOrder;
import com.grape.order.mapper.OrderMapper;
import org.springframework.stereotype.Repository;

/**
 * @author : luoyiwei
 */
@Repository
public class OrderRepository extends ServiceImpl<OrderMapper, FinanceOrder> {
}
