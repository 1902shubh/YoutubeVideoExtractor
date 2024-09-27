
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
	        implementation("com.github.1902shubh:YoutubeVideoExtractor:1.0.9")
	}
  
  ```
## Usage

How to use this library.

### 1. Define Model of streaming data like Sample app 


For information : Checkout [Model Class](https://github.com/1902shubh/YoutubeVideoExtractor/tree/master/app/src/main/java/com/papayacoders/youtubevideoextractor/model) in repository.

### 2. Extract Data

```
        var data = YoutubeExtractor.getData("4JmRCK4NNjw")

        // Update UI with the response data
        println("Video Title: ${data?.formats?.get(0)?.url}")
```

## Connect
- [Twitter](https://twitter.com/papayacoders)
- [Youtube](https://youtube.com/papayacoders)
- [LinkedIn](https://www.linkedin.com/in/1902shubh/)

