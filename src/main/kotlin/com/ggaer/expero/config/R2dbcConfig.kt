package com.ggaer.expero.config

import io.r2dbc.spi.ConnectionFactories
import io.r2dbc.spi.ConnectionFactory
import io.r2dbc.spi.ConnectionFactoryOptions.*
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories


@Configuration
@EnableR2dbcRepositories
class R2dbcConfig {

    @Bean
    fun connectionFactory(): ConnectionFactory {

        )
    }

}