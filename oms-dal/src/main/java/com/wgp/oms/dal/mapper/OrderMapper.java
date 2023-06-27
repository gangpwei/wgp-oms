package com.wgp.oms.dal.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wgp.oms.dal.entity.Order;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

/**
 * @author gangpeng.wgp
 * @date 2023/6/27 下午9:59
 */
@Service
public interface OrderMapper extends BaseMapper<Order> {

    //@Select("select * from order_1")
    //List<Order> queryAllOrder();
}
