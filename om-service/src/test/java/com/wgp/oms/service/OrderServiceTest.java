package com.wgp.oms.service;

import java.util.List;

import javax.annotation.Resource;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wgp.oms.dal.entity.Course;
import com.wgp.oms.dal.entity.Order;
import com.wgp.oms.dal.mapper.CourseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author gangpeng.wgp
 * @date 2023/6/27 ÏÂÎç10:40
 */
@RunWith(SpringRunner.class)

@SpringBootTest
public class OrderServiceTest {
    @Resource
    private OrderService orderService;

    @Resource
    private CourseMapper courseMapper;

    @Test
    public void queryOrderList(){

        List<Order> orderList = orderService.queryOrderList();
        assertNotNull(orderList);
        orderList.forEach(System.out::println);

        //courseMapper.queryAllCourse();
    }

    @Test
    public void queryCourse() {
        QueryWrapper<Course> wrapper = new QueryWrapper<Course>();
        //        wrapper.eq("user_id", 3);
        //        Course course = courseMapper.selectOne(wrapper);
        //        System.out.println(course);
        wrapper.eq("cid",668129843564511233L);
        //        wrapper.in("cid",1627057021L,1627059043L,550364727642402817L);
        List<Course> courses = courseMapper.selectList(wrapper);
        //        List<Course> courses = courseMapper.selectList(null);
        //        HintManager.getInstance().setDatabaseShardingValue(1);
        //        select xxx from course where cid=''
        //        List<Course> courses = courseMapper.queryAllCourse();
        courses.forEach(course -> System.out.println(course));
    }
}