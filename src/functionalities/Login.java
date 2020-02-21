package functionalities;

import java.util.*;

public class Login {
  public static void login() {
    System.out.println("\r\n\r\n== Social Magnet :: Login ==");

    // Form - Login
    boolean error = true;
    String username = "";
    String password = "";
    do {
      try {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username > ");
        username = sc.nextLine();
        System.out.print("Enter your password > ");
        password = sc.nextLine();
        // Form Validation throw exception
        // Password Check throw exception
        error = false;
      } catch (Exception e) {
        System.out.println(e);
      }

    } while (error);
    System.out.println(username + password);
  }
}