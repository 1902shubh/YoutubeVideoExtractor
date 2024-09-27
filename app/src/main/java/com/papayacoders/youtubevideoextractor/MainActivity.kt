package com.papayacoders.youtubevideoextractor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.papayacoders.youtubeextractor.YoutubeExtractor
import com.papayacoders.youtubeextractor.YoutubeExtractor.StreamingDataCallback
import com.papayacoders.youtubeextractor.models.StreamingData
import com.papayacoders.youtubevideoextractor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        
        binding.button.setOnClickListener {
            
            
            YoutubeExtractor.getData("4JmRCK4NNjw", object  : StreamingDataCallback{
                override fun onResponse(streamingData: StreamingData?) {
                    if (streamingData != null) {
                        println("Video URL: test ${streamingData.formats[0].url}")
                    } else {
                        println("Failed to retrieve streaming data")
                    }
                }

            })
            
            
        }

        
    }


}
