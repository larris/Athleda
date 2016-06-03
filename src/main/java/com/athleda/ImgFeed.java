package com.athleda;

/**
 * Class for storing images fields
 */
public class ImgFeed extends Feed {
    private int ImgFeedId;
    private String ImgURL;

    public int getImgFeedId() {
        return ImgFeedId;
    }

    public ImgFeed setImgFeedId(int imgFeedId) {
        ImgFeedId = imgFeedId;
        return this;
    }

    public String getImgURL() {
        return ImgURL;
    }

    public ImgFeed setImgURL(String imgURL) {
        ImgURL = imgURL;
        return this;
    }
}
