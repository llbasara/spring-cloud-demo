package com.example.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by llbas on 2018/4/19.
 *
 *  /refresh接口需post请求
 */


@RestController
@RefreshScope
public class ConfigApplication {

    @Value("${user.name}")
    String name;
    @Value("${user.age}")
    String age;
    @Value("${user.hobbies.a}")
    String hobbies;


    @RequestMapping("/name")
    public String getName(){
        return name;
    }
    @RequestMapping("/age")
    public String getAge(){
        return age;
    }
    @RequestMapping("/hobbies")
    public String getHobbies(){
        return hobbies;
    }

}
