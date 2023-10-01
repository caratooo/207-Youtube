package api;

import entity.Channel;

public interface YoutubeDB {
    Channel getChannel(String id);
}
