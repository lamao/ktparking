package org.invenit.ktparking.service

import org.invenit.ktparking.model.Parking

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 17.01.2018
 */
interface ParkingService {
    fun save(parking: Parking): Parking
    fun getAll(): List<Parking>
}