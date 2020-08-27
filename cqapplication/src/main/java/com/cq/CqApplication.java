package com.cq;

/**
 * @author changqing
 * @date 2020-06-30 13:47
 * @description:项目的启动类
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CqApplication {
    public static void main(String[] args) {
        SpringApplication.run(CqApplication.class,args);
    }
}
