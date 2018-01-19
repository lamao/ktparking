package org.invenit.ktparking.service

import org.invenit.ktparking.model.Parking

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 17.01.2018
 */
interface ParkingService {
    fun getAll(): List<Parking>
    fun create(parking: Parking): Parking
    fun update(id: Long, entity: Parking) : Parking
    fun delete(id: Long)
}