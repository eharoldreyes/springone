package com.eharoldreyes.topic

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Topic(
    @Id
    val id: String,
    val name: String
)
