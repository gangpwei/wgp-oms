package com.wgp.oms.dal.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author gangpeng.wgp
 * @date 2023/6/27 下午9:58
 */
@Data
public class Order {
    @TableId
    private Long orderId;
    private String status;
    private Date gmtCreate;
    private String skuCode;
    private String skuName;
    private BigDecimal price;
    private Long buyerId;

}
