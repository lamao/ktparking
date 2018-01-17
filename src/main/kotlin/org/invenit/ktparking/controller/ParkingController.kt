package org.invenit.ktparking.controller

import org.invenit.ktparking.model.Parking
import org.invenit.ktparking.service.ParkingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 16.01.2018
 */
@RestController(API_V1_PATH + "/parking")
class ParkingController (
        val parkingService: ParkingService
) {

    @GetMapping
    fun getAll(): List<Parking> {
        return parkingService.getAll()
    }

}