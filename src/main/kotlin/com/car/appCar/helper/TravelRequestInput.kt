package com.car.appCar.helper

data class TravelRequestInput(
    val passengerId: Long,
    val origin: String,
    val destination: String
)