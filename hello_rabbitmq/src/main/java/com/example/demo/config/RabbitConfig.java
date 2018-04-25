package com.example.demo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;

/**
 * Created by llbas on 2018/4/25.
 */
public class RabbitConfig {
    @Bean
    public Queue helloConfig(){
        return new Queue("hello");
    }
}
