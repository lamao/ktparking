package org.invenit.ktparking.controller

import org.invenit.ktparking.dto.converter.ParkingDtoConverter
import org.invenit.ktparking.dto.model.ParkingDto
import org.invenit.ktparking.model.Parking
import org.invenit.ktparking.service.ParkingService
import org.springframework.web.bind.annotation.*

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 16.01.2018
 */
@RestController
@RequestMapping(API_V1_PATH + "/parking")
class ParkingController(
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
        val result = parkingService.create(entity)
        return parkingDtoConverter.convertFrom(result)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody parking: ParkingDto): ParkingDto {
        val entity = parkingDtoConverter.convertTo(parking)
        val result = parkingService.update(id, entity)
        return parkingDtoConverter.convertFrom(result)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        parkingService.delete(id)
    }

    @PostMapping("/configure")
    fun configure(@RequestBody parking: ParkingDto): ParkingDto {
        val entity = parkingDtoConverter.convertTo(parking)
        val result = parkingService.configure(entity)
        return parkingDtoConverter.convertFrom(result)
    }


}