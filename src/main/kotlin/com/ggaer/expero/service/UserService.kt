package com.ggaer.expero.service

import com.ggaer.expero.data.UserResponse
import com.ggaer.expero.entity.User
import com.ggaer.expero.repository.UserRepository
import org.springframework.data.domain.Example
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZonedDateTime

@Service
class UserService(val userRepository: UserRepository) {

    fun testUser() : Mono<User> {

        //var users = userRepository.findAll()


        //return Mono.just(UserResponse("", "", OffsetDateTime.now()))
        var e = Example.of(User("", "hj", LocalDateTime.now()))
        return userRepository.findByUserName("hj").last(User("", "", LocalDateTime.now()))


    }
}