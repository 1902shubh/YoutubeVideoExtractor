package com.papayacoders.youtubevideoextractor

import android.content.Intent
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.downloader.Error
import com.downloader.OnDownloadListener
import com.downloader.PRDownloader
import com.downloader.Progress
import com.papayacoders.youtubeextractor.YoutubeExtractor
import com.papayacoders.youtubeextractor.YoutubeExtractor.StreamingDataCallback
import com.papayacoders.youtubeextractor.models.StreamingData
import com.papayacoders.youtubevideoextractor.databinding.ActivityMainBinding
import java.io.File

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {

            val videoUrl = "https://www.youtube.com/watch?v=1ChxJ7aGzfo" // Example URL
            val videoInfo = YouTubeVideoExtractor.extractVideoInfo(videoUrl)
            println("Video Information: \n$videoInfo")
            println("Video Information: \n$videoInfo")


            YoutubeExtractor.getData("4JmRCK4NNjw", object : StreamingDataCallback {
                override fun onResponse(streamingData: StreamingData?) {
                    if (streamingData != null) {
                        val downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)

                        if (!downloadsDir.exists()) {
                            downloadsDir.mkdirs()
                        }
//                        val storageDir = File(filesDir, "videos")
//                        if (!storageDir.exists()) {
//                            storageDir.mkdirs()
//                        }
                        val videoFile = File(downloadsDir, "videoTitle" + ".mp4")
                        println("Video URL: test ${streamingData.formats[0].url}")
                        var downloadId =
                            PRDownloader.download(videoUrl, videoFile.parent, videoFile.name)
                                .build()
                                .setOnStartOrResumeListener {
                                    Toast.makeText(
                                        this@MainActivity,
                                        "Download started",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                                .setOnPauseListener {
                                    Toast.makeText(
                                        this@MainActivity,
                                        "Download paused",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                                .setOnCancelListener {
                                    Toast.makeText(
                                        this@MainActivity,
                                        "Download canceled",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                                .setOnProgressListener { progress: Progress ->
                                    var percentage =
                                        progress.currentBytes * 100 / progress.totalBytes
                                    Log.d("SHUBH", "onResponse: $percentage")
                                }

                                .start(object : OnDownloadListener {
                                    override fun onDownloadComplete() {
                                        Toast.makeText(
                                            this@MainActivity,
                                            "Download complete",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                       
                                    }


                                    override fun onError(error: Error) {
                                        Toast.makeText(
                                            this@MainActivity,
                                            "Error downloading video",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    }
                                })
                    } else {
                        println("Failed to retrieve streaming data")
                    }
                }

            })


        }


    }


}
