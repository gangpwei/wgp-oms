package com.wgp.oms.service;

import java.util.List;

import javax.annotation.Resource;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wgp.oms.dal.entity.Order;
import com.wgp.oms.dal.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
 * @author gangpeng.wgp
 * @date 2023/6/27 下午10:08
 */
@Service
public class OrderService {
    @Resource
    private OrderMapper orderMapper;

    public List<Order> queryOrderList() {
        QueryWrapper<Order> wrapper = new QueryWrapper<Order>();
        wrapper.eq("order_id",1L);
        return orderMapper.selectList(wrapper);
    }

}
