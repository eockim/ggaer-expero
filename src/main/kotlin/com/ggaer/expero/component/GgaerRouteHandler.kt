package com.ggaer.expero.component

import com.ggaer.expero.service.UserService
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component
class GgaerRouteHandler(val userService: UserService) {

    fun test(serverRequest: ServerRequest) : Mono<ServerResponse> {

        val test = mapOf("a" to "1", "b" to "2", "c" to "3")
        return ServerResponse.ok().body(BodyInserters.fromValue(test))

    }

    fun getUser(serverRequest: ServerRequest): Mono<ServerResponse> {
        //val test = mapOf("a" to "1", "b" to "2", "c" to "3")

        return userService.testUser()
            .flatMap { ServerResponse.ok().body(BodyInserters.fromValue(it)) }
    }
}