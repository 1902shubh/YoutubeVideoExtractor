package com.papayacoders.youtubeextractor.models

data class StreamingData(
    val adaptiveFormats: List<AdaptiveFormat>,
    val expiresInSeconds: String,
    val formats: List<Format>
)