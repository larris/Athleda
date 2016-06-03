package com.athleda;

/**
 * Class for storing videos fields
 */
public class VideoFeed extends Feed {
    private int videoFeedId;
    private String videoURL;

    public int getVideoFeedId() {
        return videoFeedId;
    }

    public VideoFeed setVideoFeedId(int videoFeedId) {
        this.videoFeedId = videoFeedId;
        return this;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public VideoFeed setVideoURL(String videoURL) {
        this.videoURL = videoURL;
        return this;
    }
}
