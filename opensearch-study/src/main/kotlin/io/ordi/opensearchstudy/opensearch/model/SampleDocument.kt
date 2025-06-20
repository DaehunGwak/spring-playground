package io.ordi.opensearchstudy.opensearch.model

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType
import org.springframework.data.elasticsearch.annotations.DateFormat
import java.time.LocalDateTime

@Document(indexName = "documents")
data class SampleDocument(
    @Id
    val id: String? = null,

    @Field(type = FieldType.Text, name = "title")
    val title: String,

    @Field(type = FieldType.Text, name = "content")
    val content: String,

    @Field(type = FieldType.Date, format = [DateFormat.date_hour_minute_second_millis], name = "createdAt")
    val createdAt: LocalDateTime = LocalDateTime.now()
)
