package com.cn.cloud.gateway.limit.gatewaylimit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GatewayLimitApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayLimitApplication.class, args);
    }

    @Bean
    public HostAddrKeyResolver hostAddrKeyResolver(){
        return new HostAddrKeyResolver();
    }

//    @Bean
    public UriKeyResolver uriKeyResolver(){
        return new UriKeyResolver();
    }

    //@Bean
    public UserKeyResolver userKeyResolver(){
        return new UserKeyResolver();
    }
}
