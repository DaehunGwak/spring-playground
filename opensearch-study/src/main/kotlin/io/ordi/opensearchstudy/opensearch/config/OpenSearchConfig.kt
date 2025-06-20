package io.ordi.opensearchstudy.opensearch.config

import org.opensearch.data.client.orhlc.AbstractOpenSearchConfiguration
import org.opensearch.data.client.orhlc.ClientConfiguration
import org.opensearch.data.client.orhlc.RestClients
import org.opensearch.client.RestHighLevelClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories
import java.time.Duration

@Configuration
@EnableElasticsearchRepositories(basePackages = ["io.ordi.opensearchstudy.opensearch.repository"])
class OpenSearchConfig : AbstractOpenSearchConfiguration() {

    @Value("\${opensearch.uris}")
    private lateinit var opensearchUris: String
    
    @Value("\${opensearch.socket-timeout}")
    private lateinit var socketTimeout: String
    
    @Value("\${opensearch.connection-timeout}")
    private lateinit var connectionTimeout: String

    @Bean
    override fun opensearchClient(): RestHighLevelClient {
        val clientConfiguration = ClientConfiguration.builder()
            .connectedTo(opensearchUris.removePrefix("http://"))
            .withSocketTimeout(Duration.parse("PT$socketTimeout"))
            .withConnectTimeout(Duration.parse("PT$connectionTimeout"))
            .build()
        
        return RestClients.create(clientConfiguration).rest()
    }
}