package functionalities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import entities.post.Post;
import entities.User;
import entities.post.Reply;

public class Newsfeed {
  private static void printPosts(ArrayList<Post> posts) {
    // List Post
    for (int i = 0; i < posts.size(); i++) {
      Post p = posts.get(i);
      // Post
      System.out.printf("%d %s: %s\r\n[ %d like, %d dislikes ]\r\n", (i + 1), p.getUser(), p.getPost(), p.getLikes().size(), p.getDislikes().size());
      // Replies
      for (int j = 0; j < p.getReplies().size(); j++) {
        Reply r = p.getReplies().get(j);
        System.out.printf(" %d.%d %s: %s\r\n", (i + 1), (j + 1), r.getUser(), r.getReply());
      }
    }
  }
  private static void printThread(Post post, int postNum) {
    System.out.println("\r\n\r\n== Social Magnet :: View a Thread ==");
    // Print post
    System.out.printf("%s: %s\r\n", post.getUser(), post.getPost());
    // Print Replies
    for (int i = 0; i < post.getReplies().size(); i++) {
      Reply r = post.getReplies().get(i);
      System.out.printf(" %d.%d %s: %s\r\n", postNum, (i + 1), r.getUser(), r.getReply());
    }
    // Print Likes
    System.out.println("\r\nWho likes this post:");
    for (int i = 0; i < post.getLikes().size(); i++) {
      User l = post.getLikes().get(i);
      System.out.printf(" %d. %s(%s)\r\n", (i + 1), l.getName(), l);
    }
    // Print Dislikes
    System.out.println("\r\nWho dislikes this post:");
    for (int i = 0; i < post.getDislikes().size(); i++) {
      User d = post.getDislikes().get(i);
      System.out.printf(" %d. %s(%s)\r\n", (i + 1), d.getName(), d);
    }
  }
  public static void newsfeed() {
    // Get Array of Post from database (RUN FROM db FILE => returns ArrayList<Post>)
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
      posts.add(new Post(user, "post", likes, dislikes, replies));
    }
    // Print
    String option = " ";
    System.out.println("\r\n\r\n== Social Magnet :: News Feed ==");
    printPosts(posts);
    while (option.charAt(0) != 'M') {
      try {
        System.out.print("[M]ain | [T]hread > ");
        Scanner sc = new Scanner(System.in);
        option = sc.nextLine();
        if (option.charAt(0) == 'T') {
          int postNum = Integer.parseInt("" + option.charAt(1)) - 1;
          printThread(posts.get(postNum), postNum + 1);
        }
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}