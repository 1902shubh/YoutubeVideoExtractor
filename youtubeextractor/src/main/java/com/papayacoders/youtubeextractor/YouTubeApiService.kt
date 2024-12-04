package com.papayacoders.youtubeextractor

import com.papayacoders.youtubeextractor.api.YouTubeRequestBody
import com.papayacoders.youtubeextractor.models.YoutubeResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface YouTubeApiService {

    @Headers("Content-Type: application/json")
    @POST("youtubei/v1/player?prettyPrint=false&key=AIzaSyBMxZEuk1yD0ZEyFqH8TyC4IoBw0n5a9I4")
    fun getPlayerData(
        @Body body: YouTubeRequestBody
    ): Call<YoutubeResponse>
}