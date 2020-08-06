package com;

import jodd.datetime.TimeUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * @author changqing
 * @date 2020-07-31 11:45
 * @description:
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class common {
    @Test
    public void test1() {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        config.useSingleServer().setPassword("root");

    /**
      * Mutil-Version Concurrency Control
      */
        final RedissonClient client = Redisson.create(config);
        RLock lock = client.getLock("lock1");
        try {
            lock.tryLock(1000, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
