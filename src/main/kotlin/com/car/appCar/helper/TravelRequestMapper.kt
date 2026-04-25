package com.car.appCar.helper

import com.car.appCar.domain.PassengerRepository
import com.car.appCar.domain.TravelRequest
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import org.springframework.web.server.ResponseStatusException

@Component
class TravelRequestMapper(val passengerRepository: PassengerRepository) {
    fun map(input: TravelRequestInput): TravelRequest {
        val passenger = passengerRepository.findById(input.passengerId).orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND, "Passenger not found")
        }

        return TravelRequest(passenger = passenger, origin = input.origin, destination = input.destination)
    }
}