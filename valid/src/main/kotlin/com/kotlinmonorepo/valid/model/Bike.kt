package com.kotlinmonorepo.valid.model

import jakarta.validation.constraints.Min
import jakarta.validation.constraints.Size

class Bike constructor(
    var manufacturer: String = "",
    @field:Size(min = 2, max = 14) val licensePlate: String,
    @field:Min(2)
    val seatCount: Int
)

class Company () {
    var name: String = "abc"
        get

    fun myfunc(n: String) {
        name = n             // we set the name here
    }
}

fun main(args: Array<String>) {
    var c = Company()
    println("Name of the company is: ${c.name}")
    c.myfunc("GeeksforGeeks")
    println("Name of the new company is: ${c.name}")
}
