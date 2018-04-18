package com.example.demo.feignTest.web;

import com.example.demo.feignTest.service.SchedualServiceHi;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by llbas on 2018/3/20.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry" + name;
    }
}
