package com.papayacoders.youtubeextractor.models

data class ResponseContext(
    val maxAgeSeconds: Int,
    val serviceTrackingParams: List<com.papayacoders.youtubeextractor.models.ServiceTrackingParam>,
    val visitorData: String
)