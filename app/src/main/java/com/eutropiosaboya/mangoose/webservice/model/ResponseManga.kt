package com.eutropiosaboya.mangoose.webservice.model

data class ResponseManga(
    private val result: String,
    private val response: String,
    private val data: List<ResponseMangaData>,
    private val limit: Int,
    private val offset: Int,
    private val total: Int
)