package io.ordi.spring.jvmcachettl.study

import io.github.oshai.kotlinlogging.KotlinLogging
import org.junit.jupiter.api.Test

private val logger = KotlinLogging.logger {}

class JvmCacheTtlPropertyTest {

    @Test
    fun `networkaddress cache ttl jvm 설정 변수 체크`() {
        logger.info { "System.getProperty: ${System.getProperty("networkaddress.cache.ttl")}" } // failed
        logger.info {
            "java.security.Security.getProperty: " +
                    java.security.Security.getProperty("networkaddress.cache.ttl")
        } // java.security conf 파일 변경 시 해당 변수로 확인 가능
    }
}
