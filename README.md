# CSC207 Group Project: YouTube Statistics and Channel Manager


**PROJECT DOMAIN**: Statistics/Data Reporter and Media Manager

**DESCRIPTION**:

We want to create an application that allows users to compare statistics between channels and videos. First, the users can choose to connect their own YouTube channel to the application. Users can then compare the statistics of various videos and/or channels. Statistics include view count, ratings, comments, subscribers, etc. We will also add some visual representations such as graphs and percentages to emphasize the statistics.

If the users do choose to connect their own YouTube channel, they will also have access to media manager-esque part of our application. There, they can manage different aspects of their account. This includes thumbnail inserting, playlist updating, subscriber deletion, etc.

**API USED**: Youtube V3 Data (https://developers.google.com/youtube/v3)

This API has many functionalities. From retrieving video and channel data to setting thumbnails.

**SCREENSHOTS OF API**:
![image](https://github.com/caratooo/207-Youtube/assets/107289876/da0e34c7-2f15-4e7e-a945-0180750a32a7)
Figure 1. Get channel statistics by a given Youtube channel ID.

**JAVA CODE OUTPUTS:**

For `src/channel-stats.java`:
```
{
  "kind": "youtube#channelListResponse",
  "etag": "MCzLMNmYkdskRUXVGQPuo8fR1XQ",
  "pageInfo": {
    "totalResults": 1,
    "resultsPerPage": 5
  },
  "items": [
    {
      "kind": "youtube#channel",
      "etag": "LIUonjVYNzCOAvVxu6rN7rpgTi4",
      "id": "UCX6OQ3DkcsbYNE6H8uQQuVA",
      "statistics": {
        "viewCount": "33339877023",
        "subscriberCount": "188000000",
        "hiddenSubscriberCount": false,
        "videoCount": "754"
      }
    }
  ]
}
```


**TECHNICAL PROBLEMS**:

Java code:
- Need to get authorization to use API
- Need to use/install lots of dependencies (Maven/Gradle) - Confused about process
  - Confused about process/how to use Maven/Gradle to download the files onto our repo, so we cannot apply the Youtube API file from: https://github.com/googleapis/google-api-java-client-services/blob/main/clients/google-api-services-youtube/v3/2.0.0/com/google/api/services/youtube
  - We have the Java code to send a request to the API, but not all the imports…so we can’t run the file in our repo

About our description:
- To "connect" means to input their channel ID (or, potentially just the channel name, we're still deciding on how that would work)
- Still deciding if we want to add statistical analysis to the statistics part.
