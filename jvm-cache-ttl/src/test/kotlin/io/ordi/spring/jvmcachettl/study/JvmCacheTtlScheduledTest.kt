package io.ordi.spring.jvmcachettl.study

import io.github.oshai.kotlinlogging.KotlinLogging
import org.junit.jupiter.api.Test
import java.net.InetAddress
import java.time.LocalDateTime
import kotlin.concurrent.fixedRateTimer

private val logger = KotlinLogging.logger {}

class JvmCacheTtlScheduledTest {
    companion object {
        const val TEST_HOST_NAME = "test.jvmcachettl.io"
        const val TIMER_PERIOD_MILLISECONDS = 1000L
    }

    @Test
    fun `jvm cache ttl 동작 스케줄 확인 테스트`() {
        logger.info {
            "networkaddress.cache.ttl: " +
                    java.security.Security.getProperty("networkaddress.cache.ttl")
        }
        logger.info {
            "networkaddress.cache.stale.ttl: " +
                    java.security.Security.getProperty("networkaddress.cache.stale.ttl")
        }
        logger.info {
            "networkaddress.cache.negative.ttl: " +
                    java.security.Security.getProperty("networkaddress.cache.negative.ttl")
        }

        val endDateTime = LocalDateTime.now().plusMinutes(3)
        val timer = fixedRateTimer(initialDelay = 0, period = TIMER_PERIOD_MILLISECONDS) {
            logger.info { "HostName/IP: ${InetAddress.getByName(TEST_HOST_NAME)}" }
        }
        while (LocalDateTime.now().isBefore(endDateTime)) {
            Thread.sleep(TIMER_PERIOD_MILLISECONDS)
        }
        timer.cancel()
    }
}