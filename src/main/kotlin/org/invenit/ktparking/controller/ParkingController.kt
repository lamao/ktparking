package org.invenit.ktparking.controller

import org.invenit.ktparking.dto.converter.ParkingDtoConverter
import org.invenit.ktparking.dto.model.ParkingDto
import org.invenit.ktparking.model.Parking
import org.invenit.ktparking.service.ParkingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 16.01.2018
 */
@RestController(API_V1_PATH + "/parking")
class ParkingController (
        val parkingService: ParkingService,
        val parkingDtoConverter: ParkingDtoConverter
) {

    @GetMapping
    fun getAll(): List<Parking> {
        return parkingService.getAll()
    }

    @PostMapping
    fun create(@RequestBody parking: ParkingDto): ParkingDto {
        val entity = parkingDtoConverter.convertTo(parking)
        val result = parkingService.save(entity)
        return parkingDtoConverter.convertFrom(result)
    }

}