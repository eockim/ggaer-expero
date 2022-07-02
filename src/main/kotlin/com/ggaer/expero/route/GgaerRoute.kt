package com.ggaer.expero.route

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.BodyInserters.fromValue
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@Configuration
class GgaerRoute {

    @Bean
    fun route() = router {
        GET("/route") {ServerResponse.ok().body(fromValue(arrayOf(1, 2, 3)))}
    }
}