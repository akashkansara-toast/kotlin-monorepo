package com.kotlinmonorepo.valid.service

import com.kotlinmonorepo.valid.model.Bike
import com.kotlinmonorepo.valid.model.Car
import com.kotlinmonorepo.valid.model.Truck
import jakarta.validation.Validation
import org.hibernate.validator.HibernateValidator
import org.hibernate.validator.cfg.defs.NotNullDef
import org.hibernate.validator.cfg.defs.NotEmptyDef
import org.hibernate.validator.cfg.defs.SizeDef

class VehicleService {
    private var factory = Validation.buildDefaultValidatorFactory()
    private var validator = factory.validator

    fun saveCar(car: Car) {
        val validationResult = validator.validate(car)
        println(validationResult)
    }

    fun saveBike(bike: Bike) {
        val validationResult = validator.validate(bike)
        println(validationResult)
    }

    fun saveTruck(truck: Truck) {
        val configuration = Validation
            .byProvider(HibernateValidator::class.java)
            .configure()
        val constraintMapping = configuration.createConstraintMapping()
        constraintMapping
            .type(Truck::class.java)
            .field(Truck::manufacturer.name)
            .constraint(NotEmptyDef())
            .field("licensePlate")
            .ignoreAnnotations(true)
            .constraint(NotNullDef())
            .constraint(SizeDef().min(2).max(14))
        val validationResult = validator.validate(truck)
        println(validationResult)
    }
}
