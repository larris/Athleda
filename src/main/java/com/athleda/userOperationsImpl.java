package com.athleda;

import java.util.ArrayList;
import java.util.List;

/**
 * userOperations implementation
 */
public class userOperationsImpl implements userOperations {

    public void addPost(Post post) {

    }

    public void deletePost(Post post) {

    }

    public void updatePost(Post post) {

    }

    public void uploadVideo(VideoFeed feedUrl) {

    }

    public void deleteVideo(VideoFeed delVid) {
        /*deletes from the database a specified video for the current user
         * ex. deleteVideo(delVid.getUserId(),delVid.getVideoFeedId());
         */

    }

    public void uploadImage(ImgFeed imgUrl) {

    }

    public void deleteImage(ImgFeed delImg) {

        /*deletes from the database a specified image for the current user
         * ex. deleteImg(delImg.getUserId(), delImg.getImgFeedId());
         */
    }

    public void addConnection(Connections connection) {

       /* adds a new friend to the users connections
        * connection.getUserId() is the id of the current user and
        *  connection.getConnectedUsrID() is the userid of the new user witch will connect*/
    }

    public void deleteConnection(Connections connection) {
       /* deletes a connection from the current users connections
        * connection.getUserId() is the id of the current user and
        *  connection.getConnectedUsrID() is the userid of the  user witch will be deleted*/

    }


    public List<Post> postsByUser(int usrId) {
        List<Post> post = new ArrayList<Post>();
        /* read from database all the posts with "usrId" and store them to a list\
        *   ex Arrays.asList(Post)/*/
        return post;
    }

    public List<VideoFeed> videosbyUser(int usrId) {
        List<VideoFeed> vFeeds = new ArrayList<VideoFeed>();
        /* read from database all the Video Feeds with "usrId" and store them to a list\
        *   ex Arrays.asList(VideoFeed)/*/
        return vFeeds;
    }

    public List<ImgFeed> imagesByUser(int usrId) {
        List<ImgFeed> iFeeds = new ArrayList<ImgFeed>();
        /* read from database all the Image Feeds with "usrId" and store them to a list\
        *   ex Arrays.asList(ImgFeed)/*/

        return iFeeds;
    }

    public List<UserAccount> getAllConnections() {
      List<UserAccount> coonections= new ArrayList<UserAccount>();
        /*returns all connections-UserAccounts from the database for the user to choose. */

        return coonections;
    }

    public List<Connections> friendsList(int userId) {
        List<Connections> friends =new ArrayList<Connections>();


        /* read from database all the users( userId) friends-connections  and store them to a list
        *   ex Arrays.asList(Connections)*/

        return  friends;
    }


}
