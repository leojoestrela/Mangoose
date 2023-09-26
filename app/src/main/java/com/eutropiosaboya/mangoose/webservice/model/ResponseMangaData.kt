package com.eutropiosaboya.mangoose.webservice.model


data class ResponseMangaData(
    private val id: String,
    private val type: String,
    private val attributes: ResponseMangaAttributes,
)