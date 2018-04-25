package com.example.demo.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by llbas on 2018/4/25.
 */

@Component
@RabbitListener(queues = "hello")
public class Receiver {
    private final Logger logger = LoggerFactory.getLogger(Receiver.class);

    @RabbitHandler
    public void receiver(String hello){
        logger.info("接受消息=====>>>>{}", hello);
    }

}
