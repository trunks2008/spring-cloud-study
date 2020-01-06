package com.cn.cloud.feign.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "eureka-hi", fallback = ServiceHiHystrix.class)
public interface ServiceHi {

    @RequestMapping(value="/hi",method = RequestMethod.GET)
    String sayhiFromClientOne(@RequestParam(value="name") String name);
}
