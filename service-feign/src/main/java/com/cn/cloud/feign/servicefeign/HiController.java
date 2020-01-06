package com.cn.cloud.feign.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    ServiceHi serviceHi;

    @GetMapping(value="feignHi")
    public String sayHi(@RequestParam String name){
        return serviceHi.sayhiFromClientOne(name);
    }

}
