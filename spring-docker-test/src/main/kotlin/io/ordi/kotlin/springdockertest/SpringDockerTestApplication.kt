package io.ordi.kotlin.springdockertest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDockerTestApplication

fun main(args: Array<String>) {
    runApplication<SpringDockerTestApplication>(*args)
}
