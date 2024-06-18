package com.grape.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.grape.order.entity.FinanceOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : luoyiwei
 */
@Mapper
public interface OrderMapper  extends BaseMapper<FinanceOrder> {
}
