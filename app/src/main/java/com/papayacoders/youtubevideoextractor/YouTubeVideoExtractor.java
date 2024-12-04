package com.papayacoders.youtubevideoextractor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YouTubeVideoExtractor {

    // Function to extract video info using yt-dlp
    public static String extractVideoInfo(String videoUrl) {
        ProcessBuilder processBuilder = new ProcessBuilder();

        // Create the yt-dlp command
        processBuilder.command("yt-dlp", "-J", videoUrl); // '-J' gives JSON output

        try {
            // Start the process
            Process process = processBuilder.start();

            // Read the output of yt-dlp
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder output = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            // Wait for the process to finish
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                return output.toString(); // Return the video information as JSON
            } else {
                return "Error: yt-dlp process exited with code " + exitCode;
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        String videoUrl = "https://www.youtube.com/watch?v=1ChxJ7aGzfo"; // Example URL
        String videoInfo = extractVideoInfo(videoUrl);
        System.out.println("Video Information: \n" + videoInfo);
    }
}
