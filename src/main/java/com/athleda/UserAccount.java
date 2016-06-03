package com.athleda;

import java.util.Date;
import java.util.List;

/**
 * Class that holds the user details
 *
 */
public class UserAccount extends User {
    private int userId ;
    private String userName;
    private String password;
    private String email;
    private List<UserType> userType;
    private Date createdDate;
    private Date deletedDate;
    private List<VideoFeed> videoFeeds;
    private List<ImgFeed> imageFeeds;
    private List<Post> posts;
    private List<Connections> connections;
    private userOperations userOp;



    //methods for adding-updating-deleting  data(posts,videos,images,connections),
    //methods for retrieving data(posts,videos,images,connections)

    // Creates a new userOp for the user and store it to a database
    public void createPost( Post post) {
        userOp.addPost(post);

    }
    //Updates a userOp
    public void updatePost ( Post post){
        userOp.updatePost(post);

    }
    //Deletes a userOp
    public void deletePost(Post post){
        userOp.deletePost(post);
    }
    //creates a Video feed for the user
    public void uploadVideo(VideoFeed vFeed){
        userOp.uploadVideo(vFeed);

    }
    //creates a image for the user
    public void uploadImage(ImgFeed iFeed){
        userOp.uploadImage(iFeed);
    }

    //a list with all the users posts
    public List<Post> getUsersPosts(int userId){
        setPosts(userOp.postsByUser(this.getUserId()));

        return getPosts();
    }

    //a list with all the users videos
    public List<VideoFeed> getUsersVideoFeeds(int userId){
        setVideoFeeds( userOp.videosbyUser(this.getUserId()));
        return getVideoFeeds();
    }
    //a list with all the users images
    public List<ImgFeed> getUsersImageFeed(int userId) {
        setImageFeeds(userOp.imagesByUser(this.getUserId()));
        return getImageFeeds();
    }

    public List<UserAccount> getConnections(){
        return userOp.getAllConnections();
    }

    public List<Connections> getUsersFriends(int userId){
    //a friends list
        return userOp.friendsList(this.getUserId());
    }



    //Getters setters


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<UserType> getUserType() {
        return userType;
    }

    public void setUserType(List<UserType> userType) {
        this.userType = userType;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    public List<VideoFeed> getVideoFeeds() {
        return videoFeeds;
    }

    public void setVideoFeeds(List<VideoFeed> videoFeeds) {
        this.videoFeeds = videoFeeds;
    }

    public List<ImgFeed> getImageFeeds() {
        return imageFeeds;
    }

    public void setImageFeeds(List<ImgFeed> imageFeeds) {
        this.imageFeeds = imageFeeds;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void setConnections(List<Connections> connections) {
        this.connections = connections;
    }
}
