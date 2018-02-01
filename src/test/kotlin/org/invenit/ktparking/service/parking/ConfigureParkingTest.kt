package org.invenit.ktparking.service.parking

import com.nhaarman.mockito_kotlin.whenever
import org.invenit.ktparking.model.Parking
import org.invenit.ktparking.model.Spot
import org.invenit.ktparking.repository.ParkingRepository
import org.invenit.ktparking.service.ParkingService
import org.invenit.ktparking.service.impl.ParkingServiceImpl
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.mockito.Matchers
import org.mockito.Mock
import org.mockito.Mockito.only
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 23.01.2018
 */
class ConfigureParkingTest {

    private lateinit var parkingService: ParkingService

    @Mock
    private lateinit var parkingRepository: ParkingRepository

    @Before
    fun init() {
        MockitoAnnotations.initMocks(this)
        parkingService = ParkingServiceImpl(parkingRepository)
    }

    @Test
    fun testConfigure() {
        val parking = Parking()
        parking.name = "name"

        parking.spots.add(Spot(1.0))
        parking.spots.add(Spot(1.0))
        parking.spots.add(Spot(2.0, "roof"))

        whenever(parkingRepository.save(parking)).thenReturn(Parking("name", 1))

        val result = parkingService.configure(parking)

        assertNotNull(result)
        verify(parkingRepository, only()).save(Matchers.any(Parking::class.java))
        assertEquals(1, result.id)
        assertEquals("name", result.name)
    }
}