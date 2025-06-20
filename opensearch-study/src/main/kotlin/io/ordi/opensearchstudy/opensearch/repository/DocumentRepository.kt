package io.ordi.opensearchstudy.opensearch.repository

import io.ordi.opensearchstudy.opensearch.model.SampleDocument
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface DocumentRepository : CrudRepository<SampleDocument, String> {
    fun findByTitleContaining(title: String): List<SampleDocument>
    fun findByContentContaining(content: String): List<SampleDocument>
}
