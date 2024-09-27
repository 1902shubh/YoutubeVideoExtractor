package com.papayacoders.youtubeextractor.models

data class YoutubeResponse(
    val adBreakHeartbeatParams: String? = null,
    val playabilityStatus: com.papayacoders.youtubeextractor.models.PlayabilityStatus? = null,
    val playbackTracking: com.papayacoders.youtubeextractor.models.PlaybackTracking? = null,
    val playerConfig: PlayerConfig? = null,
    val responseContext: com.papayacoders.youtubeextractor.models.ResponseContext? = null,
    val streamingData: com.papayacoders.youtubeextractor.models.StreamingData? = null,
    val trackingParams: String? = null,
    val videoDetails: VideoDetails? = null
)