package com.kotlinmonorepo.valid

import com.kotlinmonorepo.valid.model.Bike
import com.kotlinmonorepo.valid.model.Car
import com.kotlinmonorepo.valid.model.Truck
import com.kotlinmonorepo.valid.service.VehicleService

fun main(args: Array<String>) {
    App.main(args)
}

class App {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val vehicleService = VehicleService()
            val car1 = Car(
                manufacturer = "",
                licensePlate = "",
                seatCount = 11
            )
            val bike1 = Bike(
                manufacturer = "",
                licensePlate = "",
                seatCount = 1
            )
            val t1 = Truck(
                manufacturer = "",
                licensePlate = "",
                seatCount = 1
            )
            vehicleService.saveCar(car1)
            vehicleService.saveBike(bike1)
            vehicleService.saveTruck(t1)
        }
    }
}
