package com.cq.controller;

import com.cq.entity.AccountEntity;
import com.cq.service.AccountService;
import net.bytebuddy.build.Plugin;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author changqing
 * @date 2020-07-14 13:46
 * @description:
 */
@Controller
@ResponseBody
@RequestMapping(value = "/chanqing")
public class EntityWrapperDemoController {
    @Autowired
    private AccountService accountService;
    @RequestMapping(value = "/account",method = RequestMethod.GET)
    public   void   selectAccountList(HttpServletResponse response) throws IOException {

        List<AccountEntity> accountEntities = accountService.selectAccount();
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
       // response.getWriter().write(accountEntities.toString());
        response.getWriter().print(accountEntities);
        //return accountEntities;
        test5();
    }

    public static void main(String[] args) {
        test5();
    }

    public static void test5() {

        // ReflectionDemo.get(1,"小明");
        List<String> list = new ArrayList<>();
        list.add("小明");
        list.add("乔丹");
        list.add("小怪");
        for (int i = 0; i < 4; i++) {

           /* Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    for (String s : list) {
                        get(i, s);
                    }

                }
            };
            executorService.execute(runnable);
        }*/
        }
    }


    public static void get(Integer count) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<String> list = new ArrayList<>();
        list.add("小明");
        list.add("乔丹");
        list.add("小怪");
        for (String s : list) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    workTimes();
                    Date date = new Date("yyyy-MM-dd HH:mm:ss");
                    System.out.println(String.join(date.toString(),s,", 翻越了第",count.toString(),"个障碍物, 使用了"+ workTimes()));
                }
            });
        }

    }

    /**
     * 模拟翻越的时间
     * @return
     */
    public static String workTimes() {
        // ReflectionDemo.get(1,"小明");
        long l = System.currentTimeMillis();
        try {
            Thread.sleep(1004);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Calendar instance = Calendar.getInstance();
        long timeInMillis = instance.getTimeInMillis();
        System.out.println(timeInMillis - l);
        Long longs = timeInMillis - l;
        BigDecimal bigDecimal = new BigDecimal(longs);
        BigDecimal bigDecimal1 = new BigDecimal(1000);
        BigDecimal multiply = bigDecimal.divide(bigDecimal1, 3, BigDecimal.ROUND_HALF_DOWN);

        System.out.println(multiply.toString());
        return multiply.toString();
    }
}
