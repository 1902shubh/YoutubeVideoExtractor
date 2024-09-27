package com.papayacoders.youtubevideoextractor;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.papayacoders.youtubeextractor.YoutubeExtractor;
import com.papayacoders.youtubevideoextractor.databinding.ActivityMainBinding;

public class TestActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.button.setOnClickListener(v -> {
            YoutubeExtractor.INSTANCE.getData("4JmRCK4NNjw", streamingData -> {
                if (streamingData != null) {
                    Log.d("shubh","Video URL: test "+streamingData.getFormats().get(0).getUrl());
                } else {
                    Log.d("shubh","Failed to retrieve streaming data");
                }
            });
        });

    }
}
