package org.invenit.ktparking.service.impl

import org.invenit.ktparking.model.Parking
import org.invenit.ktparking.repository.ParkingRepository
import org.invenit.ktparking.service.ParkingService
import org.invenit.ktparking.service.exceptions.EntityNotFound
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 17.01.2018
 */
@Service
@Transactional
class ParkingServiceImpl(
        @Autowired
        val parkingRepository: ParkingRepository
) : ParkingService {

    override fun getAll(): List<Parking> {
        return parkingRepository.findAll()
    }

    override fun create(parking: Parking): Parking {
        return parkingRepository.save(parking)
    }

    override fun update(id: Long, entity: Parking) : Parking {
        if (!parkingRepository.exists(id)) {
            throw EntityNotFound("Parking #${id} not found")
        }
        entity.id = id
        return parkingRepository.save(entity)
    }

    override fun delete(id: Long) {
        parkingRepository.delete(id)
    }
}