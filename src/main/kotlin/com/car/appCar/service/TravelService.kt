package com.car.appCar.service

import com.car.appCar.domain.TravelRequest
import com.car.appCar.domain.TravelRequestRepository
import com.car.appCar.helper.TravelRequestInput
import org.springframework.stereotype.Component

@Component
class TravelService(val traveRequestRepository: TravelRequestRepository) {

    fun saveTravelRequest(travelRequest: TravelRequest) = traveRequestRepository.save(travelRequest)
}