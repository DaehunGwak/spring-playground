package io.ordi.opensearchstudy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [ElasticsearchDataAutoConfiguration::class])
class OpensearchStudyApplication

fun main(args: Array<String>) {
    runApplication<OpensearchStudyApplication>(*args)
}
