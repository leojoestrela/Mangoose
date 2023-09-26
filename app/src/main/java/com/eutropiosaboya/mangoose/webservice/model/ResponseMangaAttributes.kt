package com.eutropiosaboya.mangoose.webservice.model


data class ResponseMangaAttributes(
    var title: TitleDescription,
    val description: TitleDescription,
    var isLocked: Boolean,
    var lastVolume: String,
    var lastChapter: String,
    var status: String,
    var year: Int,
    var contentRating: String,
    var state: String,
    var chapterNumbersResetOnNewVolume: Boolean,
    var createdAt: String,
    var updatedAt: String,
    var version: Int,
    var availableTranslatedLanguages: List<String>,
    var latestUploadedChapter: String
)

data class TitleDescription(
    var en: String? = null
)
