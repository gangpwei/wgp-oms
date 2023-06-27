package com.wgp.oms.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author gangpeng.wgp
 * @date 2023/6/27 下午10:14
 */
@SpringBootApplication
@MapperScan("com.wgp.oms.dal.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
