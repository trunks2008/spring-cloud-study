package com.cn.cloud.gateway.filter.gatewayfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GatewayFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayFilterApplication.class, args);
    }

//    @Bean
//    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(r -> r.path("/customer/**")
//                        .filters(f -> f.filter(new RequestTimeFilter())
//                            .addResponseHeader("X-Response-Default-Foo", "Default-Bar"))
//                        .uri("http://httpbin.org:80/get")
//                        .order(0)
//                        .id("customer_filter_router")
//                ).build();
//    }
//
//    @Bean
//    public TokenFilter tokenFilter(){
//        return new TokenFilter();
//    }

    @Bean
    public RequestTimeGatewayFilterFactory elapsedGatewayFilterFactory() {
        return new RequestTimeGatewayFilterFactory();
    }


}
