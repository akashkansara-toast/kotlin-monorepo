package com.kotlinmonorepo.valid.model

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.Size

data class Car(
    val manufacturer: String,

    @field:Size(min = 2, max = 14)
    val licensePlate: String,

    @field:Min(2)
    @field:Max(10)
    val seatCount: Int
)
