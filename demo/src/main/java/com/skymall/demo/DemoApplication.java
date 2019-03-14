package com.skymall.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.skymall"})
@MapperScan(basePackages = {"com.skymall.dao"})
//@EntityScan(basePackages = {"com.skymall.domain"})
//@EnableConfigurationProperties(DruidDBConfig.class)
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
// No MyBatis mapper was found in '[com.skymall.demo]' package. Please check your configuration.
}
