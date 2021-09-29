package com.spring.puzzle.class7.example3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Date;
import java.util.Random;

@Slf4j
@Component
@Order(1)
public class MyFirstEventListener implements ApplicationListener<MyEvent> {

    Random random = new Random();

    @Override
    public void onApplicationEvent(MyEvent event) {
  /*      try {*/
            log.info("myorder: 1");
 /*       }catch(Throwable throwable){
            //write error/metric to alert
        }*/

    }

    /**
     * 结论：listener的指定order顺序跟消费者的线程池有关，单线程消费可以保序，通过这个配置 simpleApplicationEventMulticaster.setTaskExecutor(newCachedThreadPool);
     */

}
