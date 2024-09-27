package com.papayacoders.youtubeextractor.models

data class PlaybackTracking(
    val ptrackingUrl: com.papayacoders.youtubeextractor.models.PtrackingUrl,
    val qoeUrl: com.papayacoders.youtubeextractor.models.QoeUrl,
    val videostatsDelayplayUrl: com.papayacoders.youtubeextractor.models.VideostatsDelayplayUrl,
    val videostatsPlaybackUrl: com.papayacoders.youtubeextractor.models.VideostatsPlaybackUrl,
    val videostatsWatchtimeUrl: com.papayacoders.youtubeextractor.models.VideostatsWatchtimeUrl
)