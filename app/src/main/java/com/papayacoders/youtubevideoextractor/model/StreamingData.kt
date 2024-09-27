package com.papayacoders.youtubevideoextractor.model

data class StreamingData(
    val adaptiveFormats: List<AdaptiveFormat>,
    val expiresInSeconds: String,
    val formats: List<Format>
)