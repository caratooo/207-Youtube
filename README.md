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

**TECHNICAL PROBLEMS**:

- Need to get authorization to use API
- Need to use/install lots of dependencies (Maven/Gradle) - Confused about process
- To "connect" means to input their channel ID (or, potentially just the channel name, we're still deciding on how that would work)
- Still deciding if we want to add statistical analysis to the statistics part.
