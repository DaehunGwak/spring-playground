package io.ordi.spring.jvmcachettl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JvmCacheTtlApplication

fun main(args: Array<String>) {
    runApplication<JvmCacheTtlApplication>(*args)
}
