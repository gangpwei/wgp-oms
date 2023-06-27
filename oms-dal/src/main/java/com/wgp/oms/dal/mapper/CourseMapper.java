package com.wgp.oms.dal.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wgp.oms.dal.entity.Course;
import org.apache.ibatis.annotations.Select;

/**
 * @author ：楼兰
 * @date ：Created in 2020/11/12
 * @description:
 **/
public interface CourseMapper extends BaseMapper<Course> {

    @Select("select * from course")
    public List<Course> queryAllCourse();
}
