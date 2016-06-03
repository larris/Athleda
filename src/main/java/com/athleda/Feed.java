package com.athleda;

import java.util.Date;

/**
 * Class for general fields  on a feed used in many classes
 */
public class Feed extends UserAccount {
    private String feedTitle;
    private String feedText;
    private java.util.Date creationDate;

    public String getFeedTitle() {
        return feedTitle;
    }

    public Feed setFeedTitle(String feedTitle) {
        this.feedTitle = feedTitle;
        return this;
    }

    public String getFeedText() {
        return feedText;
    }

    public Feed setFeedText(String feedText) {
        this.feedText = feedText;
        return this;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Feed setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }
}
