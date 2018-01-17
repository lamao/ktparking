package org.invenit.ktparking.repository

import org.invenit.ktparking.repository.ParkingRepository
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 16.01.2018
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class ParkingRepositoryTest {
    @Autowired
    lateinit var parkingRepository: ParkingRepository

    @Test
    fun testContextLoaded() {
        val result = parkingRepository.findAll()
        assertNotNull(result)
    }
}