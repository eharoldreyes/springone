package com.eharoldreyes.course

import jakarta.persistence.Entity
import jakarta.persistence.Id


@Entity
data class Course(

    @Id
    val id: String,
    val name: String,
    val description: String
)
