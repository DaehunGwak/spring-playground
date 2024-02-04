package io.ordi.spring.jvmcachettl

import io.github.oshai.kotlinlogging.KotlinLogging
import org.junit.jupiter.api.Test

private val logger = KotlinLogging.logger {}

class LoggingTest {
    @Test
    fun `로깅 테스트`() {
        logger.info { "로깅 테스트" }
    }
}