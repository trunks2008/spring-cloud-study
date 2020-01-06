package com.cn.cloud.gateway.cloud.gatewaycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayCloudApplication.class, args);
    }

}
