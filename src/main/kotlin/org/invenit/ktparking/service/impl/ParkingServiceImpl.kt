package org.invenit.ktparking.service.impl

import org.invenit.ktparking.model.Parking
import org.invenit.ktparking.repository.ParkingRepository
import org.invenit.ktparking.service.ParkingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 17.01.2018
 */
@Service
class ParkingServiceImpl(
        @Autowired
        val parkingRepository: ParkingRepository
) : ParkingService {

    override fun getAll(): List<Parking> {
        return parkingRepository.findAll()
    }

    override fun save(parking: Parking): Parking {
        return parkingRepository.save(parking)
    }
}