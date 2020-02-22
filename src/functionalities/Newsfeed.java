package functionalities;

import java.util.ArrayList;
import java.util.Date;

import entities.post.Post;
import entities.User;
import entities.post.Reply;

public class Newsfeed {
  public static void newsfeed() {
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
      System.out.println("FAG");
      // NULL pointer exception
      posts.add(new Post(user, "post", likes, dislikes, replies));
    }
    // List Post
    System.out.println("\r\n\r\n== Social Magnet :: News Feed ==");
    for (int i = 0; i < posts.size(); i++) {
      Post p = posts.get(i);
      // Post
      System.out.printf("%d %s: %s\r\n[ %d like, %d dislikes ]\r\n", (i + 1), p.getUser().getName(), p.getPost(), p.getLikes().size(), p.getDislikes().size());
      // Replies
      for (int j = 0; i < p.getReplies().size(); i++) {
        Reply r = p.getReplies().get(j);
        System.out.printf(" %d.%d %s: %s\r\n", (i + 1), (j + 1), r.getUser().getName(), r.getReply());
      }
    }
  }
}