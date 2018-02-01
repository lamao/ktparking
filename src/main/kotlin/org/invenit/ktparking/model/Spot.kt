package org.invenit.ktparking.model

import javax.persistence.*

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
        var id: Int = 0,

        @ManyToOne
        @JoinColumn
        var parking: Parking? = null
) {
    constructor() : this(0.0)

    override fun toString(): String  {
        return "(id=$id, price=$price, description=$description, parking.id=${parking?.id}"
    }

}