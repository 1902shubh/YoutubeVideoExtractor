
# Youtube Video Extractor
Extract youtube video					

### Download

For information : checkout [Sample App Code](https://github.com/1902shubh/YoutubeVideoExtractor/tree/master/app) in repository.

## Dependency

*Step 1*. Add the JitPack repository to your build file

Add it in your root setting.gradle at the end of repositories:

```gradle
allprojects {
		repositories {
			...
           maven(url = "https://jitpack.io")
		}
	}
  ```
  
  
*Step 2*. Add the dependency

```gradle
	dependencies {
	        implementation("com.github.1902shubh:YoutubeVideoExtractor:1.0.2")
	}
  
  ```
## Usage

How to use this library.

### Extract Data in Kotlin

```            
            YoutubeExtractor.getData("4JmRCK4NNjw", object  : StreamingDataCallback{
                override fun onResponse(streamingData: StreamingData?) {
                    if (streamingData != null) {
                        println("Video URL: test ${streamingData.formats[0].url}")
                    } else {
                        println("Failed to retrieve streaming data")
                    }
                }

            })
```

### Extract Data in Java

```
 YoutubeExtractor.INSTANCE.getData("4JmRCK4NNjw", streamingData -> {
                if (streamingData != null) {
                    Log.d("shubh","Video URL: test "+streamingData.getFormats().get(0).getUrl());
                } else {
                    Log.d("shubh","Failed to retrieve streaming data");
                }
            });
```
## Connect
- [Twitter](https://twitter.com/papayacoders)
- [Youtube](https://youtube.com/papayacoders)
- [LinkedIn](https://www.linkedin.com/in/1902shubh/)

