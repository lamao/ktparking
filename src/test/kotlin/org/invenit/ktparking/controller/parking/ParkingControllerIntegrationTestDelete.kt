package org.invenit.ktparking.controller.parking

import org.invenit.ktparking.controller.ParkingController
import org.invenit.ktparking.dto.converter.ParkingDtoConverter
import org.invenit.ktparking.service.ParkingService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 19.01.2018
 */
@RunWith(SpringRunner::class)
@WebMvcTest(ParkingController::class)
class ParkingControllerIntegrationTestDelete {
    @Autowired
    lateinit private var mvc: MockMvc

    @MockBean
    private lateinit var parkingDtoConverter: ParkingDtoConverter

    @MockBean
    private lateinit var parkingService: ParkingService

    @Test
    fun testRegular() {
        mvc.perform(delete("/api/v1/parking/1")
                .contentType(MediaType.APPLICATION_JSON)
        )
                .andExpect(status().isOk)

    }
}