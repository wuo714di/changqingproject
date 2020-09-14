package com.cq1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.cq1"})
public class CommonApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class,args);
    }
}
