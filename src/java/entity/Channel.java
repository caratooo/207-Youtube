package entity;

public class Channel {
    private String id;
    private Integer viewcount;
    private Integer subscriberCount;
    private Boolean hiddenSubscriberCount;
    private Integer videoCount;

    public Channel(String id, Integer viewcount, Integer subscriberCount, Boolean hiddenSubscriberCount, Integer videoCount) {
        this.id = id;
        this.viewcount = viewcount;
        this.subscriberCount = subscriberCount;
        this.hiddenSubscriberCount = hiddenSubscriberCount;
        this.videoCount = videoCount;
    }
}
