package com.papayacoders.youtubeextractor.models

data class AdaptiveFormat(
    val approxDurationMs: String,
    val audioChannels: Int,
    val audioQuality: String,
    val audioSampleRate: String,
    val averageBitrate: Int,
    val bitrate: Int,
    val colorInfo: com.papayacoders.youtubeextractor.models.ColorInfo,
    val contentLength: String,
    val fps: Int,
    val height: Int,
    val highReplication: Boolean,
    val indexRange: com.papayacoders.youtubeextractor.models.IndexRange,
    val initRange: com.papayacoders.youtubeextractor.models.InitRange,
    val itag: Int,
    val lastModified: String,
    val mimeType: String,
    val projectionType: String,
    val quality: String,
    val qualityLabel: String,
    val url: String,
    val width: Int
)