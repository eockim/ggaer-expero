package com.ggaer.expero.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime
import java.time.ZonedDateTime

@Table("gr_user")
data class User(@Id val userId : String, val userName :String, val created: LocalDateTime)