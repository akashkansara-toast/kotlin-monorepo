package com.kotlinmonorepo.valid.model;

public class Vehicle {
    String manufacturer;
    String licensePlate;
    int seatCount;

    public Vehicle(
            String manufacturer,
            String licensePlate,
            int seatCount
    ) {
        this.manufacturer = manufacturer;
        this.licensePlate = licensePlate;
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
