package org.invenit.ktparking.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 22.01.2018
 */
@Entity
data class Spot(
        var price: Double,
        var description: String = "",

        @Id
        @GeneratedValue
        var id: Int = 0
) {
    constructor(): this(0.0)
}