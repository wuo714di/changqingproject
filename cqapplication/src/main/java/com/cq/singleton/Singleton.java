package com.cq.singleton;




/**
 * @author changqing
 * @date 2020-07-21 14:16
 * @description:
 */
public class Singleton {
    private  static Singleton singleton;
    private Singleton(){}

    /**
     * 这种写法不是线程安全的
     *
     * @return
     */
    public static /*synchronized 加一个锁线程安全*/ Singleton getInstance(){

        if (null==singleton){
            singleton=new Singleton();
        }
        return singleton;
    }
}
