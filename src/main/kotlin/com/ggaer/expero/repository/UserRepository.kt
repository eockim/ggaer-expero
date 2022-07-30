package com.ggaer.expero.repository

import com.ggaer.expero.data.UserResponse
import com.ggaer.expero.entity.User
import org.springframework.data.r2dbc.repository.R2dbcRepository
import reactor.core.publisher.Flux

interface UserRepository : R2dbcRepository<User, Long> {
    fun findByUserName (userName : String) : Flux<User>
}
