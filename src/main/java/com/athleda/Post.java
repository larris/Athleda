package com.athleda;

import java.util.Date;

/**
 * Class for storing posts(text) fields
 */
public class Post extends Feed{
    private  int postId;

    public int getPostId() {
        return postId;
    }

    public Post setPostId(int postId) {
        this.postId = postId;
        return this;
    }
}
