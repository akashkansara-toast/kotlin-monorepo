package com.kotlinmonorepo.valid.model

class Truck (
    manufacturer: String,
    licensePlate: String,
    seatCount: Int
) {
    val manufacturer: String = manufacturer
        get() {
            return field
        }
    val licensePlate: String = licensePlate
        get() {
            return field
        }
    val seatCount: Int = seatCount
        get() {
            return field
        }
}
