package com.papayacoders.youtubeextractor

import com.papayacoders.youtubeextractor.api.ClientData
import com.papayacoders.youtubeextractor.api.ContextData
import com.papayacoders.youtubeextractor.api.Html5PreferenceData
import com.papayacoders.youtubeextractor.api.PlaybackContextData
import com.papayacoders.youtubeextractor.api.RetrofitClient
import com.papayacoders.youtubeextractor.api.YouTubeRequestBody
import com.papayacoders.youtubeextractor.models.StreamingData
import com.papayacoders.youtubeextractor.models.YoutubeResponse
import retrofit2.Call

object YoutubeExtractor {

    fun getData(videoId: String): StreamingData? {

        var streamingData: StreamingData? = null

        val youtubeApiService = RetrofitClient.instance.create(YouTubeApiService::class.java)


        // Create your request body
        val requestBody = YouTubeRequestBody(
            videoId = videoId,
            contentCheckOk = true,
            racyCheckOk = true,
            context = ContextData(
                client = ClientData(
                    clientName = "ANDROID_CREATOR",
                    clientVersion = "22.30.100",
                    hl = "en"
                )
            ),
            playbackContext = PlaybackContextData(
                contentPlaybackContext = Html5PreferenceData(
                    html5Preference = "HTML5_PREF_WANTS"
                )
            )
        )

        youtubeApiService.getPlayerData(requestBody)
            .enqueue(object : retrofit2.Callback<YoutubeResponse> {
                override fun onResponse(
                    call: Call<YoutubeResponse>,
                    response: retrofit2.Response<YoutubeResponse>
                ) {
                    if (response.isSuccessful) {
                        val youtubeResponse = response.body()
                        streamingData = youtubeResponse!!.streamingData!!
                        println("Video Title: ${streamingData?.formats?.get(0)?.url}")
                    } else {
                        println("Video Title:issue")
                    }
                }

                override fun onFailure(call: Call<YoutubeResponse>, t: Throwable) {
                    // Handle the failure
                }
            })
        return streamingData
        

    }


}
