package org.invenit.ktparking.repository

import org.invenit.ktparking.model.Spot
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Transactional

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 22.01.2018
 */
@RunWith(SpringRunner::class)
@SpringBootTest
@Transactional
class SpotRepositoryTest {

    @Autowired
    lateinit var spotRepository: SpotRepository

    @Before
    fun setUp() {
        spotRepository.save(Spot(1.0))
        spotRepository.save(Spot(1.0))
        spotRepository.save(Spot(2.0, "with roof"))
    }

    @Test
    fun testContextLoaded() {
        val result = spotRepository.findAll()
        assertNotNull(result)
    }

    @Test
    fun testCreate() {
        val persistedEntity = spotRepository.save(Spot(1.0, "description"))
        assertNotEquals(0, persistedEntity.id)
    }

    @Test
    fun testFindAll() {
        val result = spotRepository.findAll()
        assertEquals(3, result.size)
    }

}