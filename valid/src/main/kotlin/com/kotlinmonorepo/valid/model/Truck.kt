package com.kotlinmonorepo.valid.model

import jakarta.validation.Valid

data class Truck (
    val manufacturer: String,
    val licensePlate: String,
    val seatCount: Int,
    @field:Valid
    val wheels: List<Wheel>
) {
    // val manufacturer: String = manufacturer
    //     get() { return field }
    // val licensePlate: String = licensePlate
    //     get() { return field }
    // val seatCount: Int = seatCount
    //     get() { return field }
}
// {
//     val manufacturer: String = manufacturer
//         get() {
//             return field
//         }
//     val licensePlate: String = licensePlate
//         get() {
//             return field
//         }
//     val seatCount: Int = seatCount
//         get() {
//             return field
//         }
// }

data class Wheel(
    val size: String
)
