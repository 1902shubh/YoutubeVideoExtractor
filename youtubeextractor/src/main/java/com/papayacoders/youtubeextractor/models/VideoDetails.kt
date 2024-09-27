package com.papayacoders.youtubeextractor.models

data class VideoDetails(
    val allowRatings: Boolean,
    val author: String,
    val channelId: String,
    val isCrawlable: Boolean,
    val isLiveContent: Boolean,
    val isOwnerViewing: Boolean,
    val isPrivate: Boolean,
    val isUnpluggedCorpus: Boolean,
    val keywords: List<String>,
    val lengthSeconds: String,
    val shortDescription: String,
    val thumbnail: com.papayacoders.youtubeextractor.models.Thumbnail,
    val title: String,
    val videoId: String,
    val viewCount: String
)