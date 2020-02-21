package functionalities;

import java.util.ArrayList;
import java.util.Date;

import entities.post.Post;
import entities.User;
import entities.post.Reply;

public class Newsfeed {
  public static void newsfeed() {
    System.out.println("\r\n\r\n== Social Magnet :: News Feed ==");
    // Get Array of Post from database
    ArrayList<Post> posts = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      User user = new User("u", "n");
      ArrayList<User> likes = new ArrayList<>();
      likes.add(new User("u", "n"));
      likes.add(new User("u", "n"));
      ArrayList<User> dislikes = new ArrayList<>();
      dislikes.add(new User("u", "n"));
      dislikes.add(new User("u", "n"));
      ArrayList<Reply> replies = new ArrayList<>();
      replies.add(new Reply(new Date(), new User("u", "n"), "String"));
      replies.add(new Reply(new Date(), new User("u", "n"), "String"));
      posts.add(new Post(user, likes, dislikes, replies));
    }
  }
}