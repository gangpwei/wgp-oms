package com.wgp.oms.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wgp.oms.dal.entity.Course;
import com.wgp.oms.dal.entity.Torder;
import com.wgp.oms.dal.mapper.CourseMapper;
import com.wgp.oms.dal.mapper.OrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author gangpeng.wgp
 * @date 2023/6/27 下午10:40
 */
@RunWith(SpringRunner.class)

@SpringBootTest
public class TorderServiceTest {
    @Resource
    private OrderService orderService;

    @Resource
    private CourseMapper courseMapper;

    @Resource
    private OrderMapper orderMapper;

    @Test
    public void queryOrderList() {

        List<Torder> orderList = orderService.queryOrderById(1L);
        assertNotNull(orderList);
        orderList.forEach(System.out::println);
    }

    @Test
    public void queryCourse() {
        QueryWrapper<Course> wrapper = new QueryWrapper<Course>();
        //        wrapper.eq("user_id", 3);
        //        Course course = courseMapper.selectOne(wrapper);
        //        System.out.println(course);
        wrapper.eq("cid", 1L);
        //        wrapper.in("cid",1627057021L,1627059043L,550364727642402817L);
        List<Course> courses = courseMapper.selectList(wrapper);
        //        List<Course> courses = courseMapper.selectList(null);
        //        HintManager.getInstance().setDatabaseShardingValue(1);
        //        select xxx from course where cid=''
        //        List<Course> courses = courseMapper.queryAllCourse();
        courses.forEach(course -> System.out.println(course));
    }

    //插入数据会进行分片
    @Test
    public void addOrder() {
        delete();

        for (int i = 1; i < 100; i++) {
            Torder c = new Torder();
            c.setBuyerId(Long.valueOf(i));
            c.setGmtCreate(new Date());
            c.setStatus("INIT");
            c.setPrice(BigDecimal.valueOf(1000.10));
            c.setSkuCode("sku_" + i);
            c.setSkuName("商品_" +i);
            c.setOrderId(Long.valueOf(i));
            orderMapper.insert(c);
            //insert into course values ....
        }
    }

    private void delete() {
        Map<String, Object> param = new HashMap<>();
        //param.putIfAbsent("cname", "java");
        orderMapper.deleteByMap(param);
    }
}