package functionalities;

import java.util.Scanner;
import entities.User;

public class Main {
  public static void main(User user) {
    int choice = 1;
    do {
      try {
        System.out.print("\r\n\r\n== Social Magnet :: Main Menu ==\r\nWelcome, " + user.getName() + "!\r\n1. Newsfeed\r\n2. My Wall\r\n3. My Friends\r\n4. City Farmers\r\n5. Logout\r\nEnter your choice > ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
      } catch (Exception e) {
        System.out.println(e);
      }
    } while (choice != 5);
  }
}