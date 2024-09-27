package com.papayacoders.youtubeextractor.api


// Define the data class that matches your JSON structure
data class YouTubeRequestBody(
    val videoId: String,
    val contentCheckOk: Boolean,
    val racyCheckOk: Boolean,
    val context: ContextData,
    val playbackContext: PlaybackContextData
)

data class ContextData(
    val client: ClientData
)

data class ClientData(
    val clientName: String,
    val clientVersion: String,
    val hl: String
)

data class PlaybackContextData(
    val contentPlaybackContext: Html5PreferenceData
)

data class Html5PreferenceData(
    val html5Preference: String
)