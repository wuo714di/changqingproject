package com.cq1;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class PropertiesStream {
    private static Properties properties = null;

    static {
        properties = new Properties();
        try {
            properties.load(new FileInputStream(new File("src\\main\\resources\\application.properties")));
        } catch (IOException e) {
            log.error(e.getLocalizedMessage());
        }


    }

    //将文件用留的方式加载进来
    @Test
    public void test1() {
        String session_store = (String) properties.get("session_store");
        System.out.println(session_store);
    }
}
