package com.example.demo.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by llbas on 2018/4/25.
 */
@Component
public class Sender {
    private final Logger logger = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sender(){
        String context = "sender say hello "+ new Date();
        logger.info("发送消息====>>>>>>{}",context);
        amqpTemplate.convertAndSend("hello",context);
    }
}
