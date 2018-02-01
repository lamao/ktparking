package org.invenit.ktparking.model

import javax.persistence.*

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 16.01.2018
 */
@Entity
data class Parking (
        var name: String,

        @Id
        @GeneratedValue
        var id: Long = 0,

        @OneToMany(mappedBy = "parking", cascade = arrayOf(CascadeType.ALL), orphanRemoval = true)
        var spots: MutableList<Spot> = ArrayList()
) {
    constructor(): this("")
}