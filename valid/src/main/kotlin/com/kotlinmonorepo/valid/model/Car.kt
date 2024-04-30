package com.kotlinmonorepo.valid.model

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.Size
import java.beans.BeanProperty

data class Car(
    val manufacturer: String,

    // @get:BeanProperty
    @field:Size(min = 2, max = 14)
    val licensePlate: String,

    // @get:BeanProperty
    @field:Min(2)
    @field:Max(10)
    val seatCount: Int
)
