package io.ordi.kotlin.springdockertest.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping("/api/sample")
    fun sample(): Map<String, String> {
        return mapOf("message" to "Hello, World!")
    }
}
