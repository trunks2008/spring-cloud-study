package com.cn.cloud.feign.servicefeign;

import org.springframework.stereotype.Component;

@Component()
public class ServiceHiHystrix implements ServiceHi {

    @Override
    public String sayhiFromClientOne(String name) {
        return "Hystrix : sorry "+name;
    }
}
