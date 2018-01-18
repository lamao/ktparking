package org.invenit.ktparking.dto.converter

import org.invenit.ktparking.dto.model.ParkingDto
import org.invenit.ktparking.model.Parking
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 18.01.2018
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface ParkingDtoConverter: Converter<ParkingDto, Parking>