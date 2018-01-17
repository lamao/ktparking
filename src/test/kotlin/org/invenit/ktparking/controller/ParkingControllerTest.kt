package org.invenit.ktparking.controller

import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 17.01.2018
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class ParkingControllerTest {
    @Autowired
    lateinit var parkingController: ParkingController

    @Test
    fun testContextLaded() {
        val result = parkingController.getAll()

        assertNotNull(result)
    }
}