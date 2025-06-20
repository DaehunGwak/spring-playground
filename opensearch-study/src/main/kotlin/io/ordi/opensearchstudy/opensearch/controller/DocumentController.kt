package io.ordi.opensearchstudy.opensearch.controller

import io.ordi.opensearchstudy.opensearch.model.SampleDocument
import io.ordi.opensearchstudy.opensearch.service.DocumentService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/documents")
class DocumentController(private val documentService: DocumentService) {

    @PostMapping
    fun createDocument(@RequestBody document: SampleDocument): ResponseEntity<SampleDocument> {
        val savedDocument = documentService.saveDocument(document)
        return ResponseEntity.ok(savedDocument)
    }

    @GetMapping("/{id}")
    fun getDocument(@PathVariable id: String): ResponseEntity<SampleDocument> {
        val document = documentService.findById(id)
        return if (document.isPresent) {
            ResponseEntity.ok(document.get())
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @GetMapping
    fun getAllDocuments(): ResponseEntity<List<SampleDocument>> {
        val documents = documentService.findAll()
        return ResponseEntity.ok(documents)
    }

    @GetMapping("/search/title")
    fun searchByTitle(@RequestParam title: String): ResponseEntity<List<SampleDocument>> {
        val documents = documentService.findByTitle(title)
        return ResponseEntity.ok(documents)
    }

    @GetMapping("/search/content")
    fun searchByContent(@RequestParam content: String): ResponseEntity<List<SampleDocument>> {
        val documents = documentService.findByContent(content)
        return ResponseEntity.ok(documents)
    }

    @DeleteMapping("/{id}")
    fun deleteDocument(@PathVariable id: String): ResponseEntity<Void> {
        documentService.deleteById(id)
        return ResponseEntity.noContent().build()
    }
}
