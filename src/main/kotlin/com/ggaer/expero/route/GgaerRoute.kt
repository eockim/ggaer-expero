package com.ggaer.expero.route

import com.ggaer.expero.component.GgaerRouteHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.BodyInserters.fromValue
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router
import reactor.core.publisher.Mono
import reactor.core.scheduler.Scheduler
import java.time.OffsetDateTime
import java.util.*

@Configuration
class GgaerRoute(val ggaerRouteHandler: GgaerRouteHandler) {

    @Bean
    fun route() = router {
        GET("/route") { ggaerRouteHandler.test(it) }
        GET("/route1") { ggaerRouteHandler.test(it) }
        GET("/route2") { ggaerRouteHandler.test(it) }
        GET("/users/{userName}") { ggaerRouteHandler.getUser(it) }

    }
}

fun main() {
    println(UUID.randomUUID())
}