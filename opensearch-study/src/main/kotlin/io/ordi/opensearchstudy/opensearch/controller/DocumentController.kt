package io.ordi.opensearchstudy.opensearch.controller

import io.ordi.opensearchstudy.opensearch.model.SampleDocument
import io.ordi.opensearchstudy.opensearch.service.DocumentService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.Duration

@RestController
@RequestMapping("/api/documents")
class DocumentController(private val documentService: DocumentService) {

    @PostMapping
    fun createDocument(@RequestBody document: SampleDocument): Mono<SampleDocument> {
        return documentService.saveDocument(document)
    }

    @PostMapping("/batch")
    fun createMultipleDocuments(@RequestBody documents: List<SampleDocument>): Flux<SampleDocument> {
        return documentService.saveMultipleDocuments(documents)
    }

    @GetMapping("/{id}")
    fun getDocument(@PathVariable id: String): Mono<SampleDocument> {
        return documentService.findById(id)
            .switchIfEmpty(Mono.error(RuntimeException("Document with id $id not found")))
    }

    @GetMapping
    fun getAllDocuments(): Flux<SampleDocument> {
        return documentService.findAll()
    }

    @GetMapping(value = ["/stream"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun getAllDocumentsStream(): Flux<SampleDocument> {
        return documentService.findAll()
            .delayElements(Duration.ofMillis(100)) // 스트리밍 효과를 위한 지연
    }

    @GetMapping("/search/title")
    fun searchByTitle(@RequestParam title: String): Flux<SampleDocument> {
        return documentService.findByTitle(title)
    }

    @GetMapping("/search/content")
    fun searchByContent(@RequestParam content: String): Flux<SampleDocument> {
        return documentService.findByContent(content)
    }

    @GetMapping("/search")
    fun searchByMultipleFields(
        @RequestParam(required = false) title: String?,
        @RequestParam(required = false) content: String?
    ): Flux<SampleDocument> {
        return documentService.searchByMultipleFields(title, content)
    }

    @GetMapping("/count")
    fun getDocumentCount(): Mono<Long> {
        return documentService.count()
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteDocument(@PathVariable id: String): Mono<Void> {
        return documentService.deleteById(id)
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteAllDocuments(): Mono<Void> {
        return documentService.findAll()
            .flatMap { documentService.deleteById(it.id!!) }
            .then()
    }

    @GetMapping("/search/combined")
    fun searchCombined(
        @RequestParam(required = false) title: String?,
        @RequestParam(required = false) content: String?
    ): Mono<Map<String, Any>> {
        return Mono.zip(
            documentService.searchByMultipleFields(title, content).collectList(),
            documentService.searchByMultipleFields(title, content).count()
        ).map { tuple ->
            mapOf(
                "documents" to tuple.t1,
                "totalCount" to tuple.t2,
                "searchCriteria" to mapOf(
                    "title" to title,
                    "content" to content
                )
            )
        }
    }
}
