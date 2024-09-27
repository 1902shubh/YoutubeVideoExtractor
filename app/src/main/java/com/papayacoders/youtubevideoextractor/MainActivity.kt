package com.papayacoders.youtubevideoextractor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.papayacoders.youtubeextractor.YoutubeExtractor
import com.papayacoders.youtubevideoextractor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var data = YoutubeExtractor.getData("4JmRCK4NNjw")

        // Update UI with the response data
        println("Video Title: ${data?.formats?.get(0)?.url}")

    }


}
