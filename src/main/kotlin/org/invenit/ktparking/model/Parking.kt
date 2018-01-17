package org.invenit.ktparking.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 16.01.2018
 */
@Entity
data class Parking (
        var name: String,

        @Id
        @GeneratedValue
        var id: Long = 0
) {
    constructor(): this("")
}