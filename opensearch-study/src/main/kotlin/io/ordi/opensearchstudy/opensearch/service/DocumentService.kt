package io.ordi.opensearchstudy.opensearch.service

import io.ordi.opensearchstudy.opensearch.model.SampleDocument
import io.ordi.opensearchstudy.opensearch.repository.DocumentRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.core.scheduler.Schedulers
import java.util.UUID

@Service
class DocumentService(private val documentRepository: DocumentRepository) {

    fun saveDocument(sampleDocument: SampleDocument): Mono<SampleDocument> {
        return Mono.fromCallable {
            val documentToSave = sampleDocument.copy(id = sampleDocument.id ?: UUID.randomUUID().toString())
            documentRepository.save(documentToSave)
        }.subscribeOn(Schedulers.boundedElastic())
    }

    fun findById(id: String): Mono<SampleDocument> {
        return Mono.fromCallable {
            documentRepository.findById(id).orElse(null)
        }.subscribeOn(Schedulers.boundedElastic())
         .onErrorComplete()
    }

    fun findAll(): Flux<SampleDocument> {
        return Flux.fromIterable(
            documentRepository.findAll()
        ).subscribeOn(Schedulers.boundedElastic())
    }

    fun findByTitle(title: String): Flux<SampleDocument> {
        return Flux.fromIterable(
            documentRepository.findByTitleContaining(title)
        ).subscribeOn(Schedulers.boundedElastic())
    }

    fun findByContent(content: String): Flux<SampleDocument> {
        return Flux.fromIterable(
            documentRepository.findByContentContaining(content)
        ).subscribeOn(Schedulers.boundedElastic())
    }

    fun deleteById(id: String): Mono<Void> {
        return Mono.fromRunnable<Void> {
            documentRepository.deleteById(id)
        }.subscribeOn(Schedulers.boundedElastic())
         .then()
    }

    fun searchByMultipleFields(title: String?, content: String?): Flux<SampleDocument> {
        return when {
            title != null && content != null -> {
                // 두 조건을 모두 만족하는 문서 검색 (병렬 처리)
                Flux.merge(
                    findByTitle(title),
                    findByContent(content)
                ).distinct()
            }
            title != null -> findByTitle(title)
            content != null -> findByContent(content)
            else -> Flux.empty()
        }
    }

    fun saveMultipleDocuments(documents: List<SampleDocument>): Flux<SampleDocument> {
        return Flux.fromIterable(documents)
            .parallel() // 병렬 처리
            .runOn(Schedulers.boundedElastic())
            .map { doc -> doc.copy(id = doc.id ?: UUID.randomUUID().toString()) }
            .map { documentRepository.save(it) }
            .sequential()
            .onErrorContinue { error, item -> 
                println("Error saving document $item: ${error.message}")
            }
    }

    fun count(): Mono<Long> {
        return Mono.fromCallable {
            documentRepository.count()
        }.subscribeOn(Schedulers.boundedElastic())
    }
}
