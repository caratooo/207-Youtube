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

    public static ChannelBuilder builder() {
        return new ChannelBuilder();
    }

    public static class ChannelBuilder {
        private String id;
        private Integer viewcount;
        private Integer subscriberCount;
        private Boolean hiddenSubscriberCount;
        private Integer videoCount;

        ChannelBuilder() {
        }

        public ChannelBuilder id(String id) {
            this.id = id;
            return this;
        }

        public ChannelBuilder viewcount(Integer viewcount) {
            this.viewcount = viewcount;
            return this;
        }

        public ChannelBuilder subscriberCount(Integer subscriberCount) {
            this.subscriberCount = subscriberCount;
            return this;
        }
        public ChannelBuilder hiddenSubscriberCount(Boolean hiddenSubscriberCount) {
            this.hiddenSubscriberCount = hiddenSubscriberCount;
            return this;
        }

        public ChannelBuilder videoCount(Integer videoCount) {
            this.videoCount = videoCount;
            return this;
        }

        public Channel build() {
            return new Channel(id, viewcount, subscriberCount, hiddenSubscriberCount, videoCount);
        }
    }
}


