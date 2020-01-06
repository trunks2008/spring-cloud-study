package com.cn.cloud.gateway.limit.gatewaylimit;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

public class UserKeyResolver implements KeyResolver {
    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        return Mono.just(exchange.getRequest().getQueryParams().getFirst("user"));
    }
}
