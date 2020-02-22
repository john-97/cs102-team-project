package entities.post;

import java.util.ArrayList;
import entities.User;

public class Post {
  private User user;
  private String post;
  private ArrayList<User> likes;
  private ArrayList<User> dislikes;
  private ArrayList<Reply> replies;
  public Post(User user, String post, ArrayList<User> likes, ArrayList<User> dislikes, ArrayList<Reply> replies) {
    this.user = user;
    this.post = post;
    this.likes = likes;
    this.dislikes = dislikes;
    this.replies = replies;
  }
  public User getUser() {
    return this.user;
  }
  public String getPost() {
    return this.post;
  }
  public ArrayList<User> getLikes() {
    return this.likes;
  }
  public ArrayList<User> getDislikes() {
    return this.dislikes;
  }
  public ArrayList<Reply> getReplies() {
    return this.replies;
  }
  public boolean like(User user) {
    // Add user to likes if not exist
    // Remove user from dislikes if exist
    // Change db
    return true;
  }
  public boolean dislike(User user) {
    // Add user to dislikes if not exist
    // Remove user from dislikes if exist
    // Change db
    return true;
  }
  public boolean reply(String reply, User user) {
    // Add Reply
    // Change db
    return true;
  }
}