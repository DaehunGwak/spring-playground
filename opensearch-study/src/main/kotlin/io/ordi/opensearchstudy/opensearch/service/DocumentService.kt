package io.ordi.opensearchstudy.opensearch.service

import io.ordi.opensearchstudy.opensearch.model.SampleDocument
import io.ordi.opensearchstudy.opensearch.repository.DocumentRepository
import org.springframework.stereotype.Service
import java.util.UUID
import java.util.Optional

@Service
class DocumentService(private val documentRepository: DocumentRepository) {

    fun saveDocument(sampleDocument: SampleDocument): SampleDocument {
        val documentToSave = sampleDocument.copy(id = sampleDocument.id ?: UUID.randomUUID().toString())
        return documentRepository.save(documentToSave)
    }

    fun findById(id: String): Optional<SampleDocument> {
        return documentRepository.findById(id)
    }

    fun findAll(): List<SampleDocument> {
        return documentRepository.findAll().toList()
    }

    fun findByTitle(title: String): List<SampleDocument> {
        return documentRepository.findByTitleContaining(title)
    }

    fun findByContent(content: String): List<SampleDocument> {
        return documentRepository.findByContentContaining(content)
    }

    fun deleteById(id: String) {
        documentRepository.deleteById(id)
    }
}
