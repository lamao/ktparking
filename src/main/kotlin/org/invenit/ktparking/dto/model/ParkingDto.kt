package org.invenit.ktparking.dto.model

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 18.01.2018
 */

data class ParkingDto(
        var name: String,
        var id: Long? = null
) {
    constructor(): this("")
}