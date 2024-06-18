package com.grape.order.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.grape.order.entity.Flow;
import com.grape.order.mapper.FlowMapper;
import org.springframework.stereotype.Repository;

/**
 * @author : luoyiwei
 */
@Repository
public class FlowRepository extends ServiceImpl<FlowMapper, Flow> {

}
