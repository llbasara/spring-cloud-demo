package com.example.demo.feignTest.service;

import com.example.demo.feignTest.web.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by llbas on 2018/3/20.
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value= "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value="name")String name);
}
