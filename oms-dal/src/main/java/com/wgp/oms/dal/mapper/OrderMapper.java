package com.wgp.oms.dal.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wgp.oms.dal.entity.Torder;
import org.springframework.stereotype.Service;

/**
 * @author gangpeng.wgp
 * @date 2023/6/27 下午9:59
 */
@Service
public interface OrderMapper extends BaseMapper<Torder> {

    //@Select("select * from order_1")
    //List<Order> queryAllOrder();
}
