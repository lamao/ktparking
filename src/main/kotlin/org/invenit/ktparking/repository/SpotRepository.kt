package org.invenit.ktparking.repository

import org.invenit.ktparking.model.Spot
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 22.01.2018
 */
@Repository
interface SpotRepository : JpaRepository<Spot, Long>