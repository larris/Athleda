package com.athleda;

import java.util.List;

/**
 * Interface to handle user operations
 */
public interface userOperations {

     void addPost(Post post);

     void deletePost(Post post);

     void updatePost(Post post);

     void uploadVideo(VideoFeed feedUrl);

     void deleteVideo(VideoFeed delVid);

     void uploadImage(ImgFeed imgUrl);

     void deleteImage(ImgFeed delImg);

     void addConnection(Connections connection);

     void deleteConnection(Connections connection);

     List<Post>  postsByUser (int usrId);

     List<VideoFeed>  videosbyUser (int usrId);

     List<ImgFeed> imagesByUser (int usrId);

     List<UserAccount> getAllConnections();

     List<Connections> friendsList(int userId);



}
