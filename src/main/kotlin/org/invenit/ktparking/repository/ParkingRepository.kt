package org.invenit.ktparking.repository

import org.invenit.ktparking.model.Parking
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 16.01.2018
 */
interface ParkingRepository : JpaRepository<Parking, Long>