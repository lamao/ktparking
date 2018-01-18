package org.invenit.ktparking.dto.converter

/**
 * Created by vyacheslav.mischeryakov
 * Creation date 18.01.2018
 */
interface Converter<SRC, DST> {
    fun convertTo(src: SRC): DST = throw UnsupportedOperationException("Not implemented")

    fun convertFrom(dst: DST): SRC = throw UnsupportedOperationException("Not implemented")
}