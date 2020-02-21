package start;
import java.util.*;

import functionalities.*;

public class SocialMagnet {
  public static void main(String[] args) {
    // == Welcome Page ==
    int choice = 1;
    do {
      try {
        // Welcome String
        String welcome = "\r\n\r\n== Social Magnet :: Welcome ==\r\nGood Morning, anonymous!\r\n1. Register\r\n2. Login\r\n3. Exit\r\nEnter your choice >";
        System.out.print(welcome);

        // Form - Functionality (wth err loop)
        do {
          if (choice < 1 || choice > 3) System.out.println("Please enter a choice between 1 & 3");
          Scanner sc = new Scanner(System.in);
          choice = sc.nextInt();
        } while (choice < 1 || choice > 3);

        // Run Static Method of Login/ Register
        if (choice == 1) Registration.registration();
        if (choice == 2) Login.login();
      } catch (Exception e) {
        System.out.println(e);
      }
      
    } while (choice != 3);
    

  }
}