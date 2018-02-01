package org.invenit.ktparking.repository

import org.invenit.ktparking.model.Parking
import org.invenit.ktparking.model.Spot
import org.invenit.ktparking.repository.ParkingRepository
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Transactional

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 16.01.2018
 */
@RunWith(SpringRunner::class)
@SpringBootTest
@Transactional
class ParkingRepositoryTest {
    @Autowired
    lateinit var parkingRepository: ParkingRepository

    @Test
    fun testContextLoaded() {
        val result = parkingRepository.findAll()
        assertNotNull(result)
    }

    @Test
    fun testSave() {
        val parking = Parking("name")
        parking.spots.add(Spot(1.0))
        parking.spots.add(Spot(1.0))
        parking.spots.add(Spot(2.0, "roof"))
        parking.spots.forEach {
            it.parking = parking
        }

        val result = parkingRepository.save(parking)

        assertNotNull(result)
        assertEquals("name", result.name)
        assertEquals(1, result.id)

        assertEquals(3, result.spots.size)
        parking.spots.forEachIndexed { index, spot ->
            assertNotEquals("$index, $spot", 0, spot.id)
            assertEquals("$index, $spot", result, spot.parking)
        }
    }
}