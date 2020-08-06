package com.cq.TestDemo;

import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * @author changqing
 * @date 2020-07-22 14:27
 * @description: 动态代理
 */
public class ProxyDemo implements InvocationHandler {
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        return null;
    }
}
