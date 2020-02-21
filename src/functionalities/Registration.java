package functionalities;

import java.util.*;

public class Registration {
  public static void registration() {
    System.out.println("\r\n\r\n== Social Magnet :: Registration ==");

    // Form - new user
    boolean error = true;
    String username = "";
    String name = "";
    String password = "";
    String confirmPassword = "";
    do {
      try {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Enter your username > ");
        username = sc.nextLine();
        System.out.print("2. Enter your Full name > ");
        name = sc.nextLine();
        System.out.print("3. Enter your password > ");
        password = sc.nextLine();
        System.out.print("4. Confirm your username > ");
        confirmPassword = sc.nextLine();
        // Form Validation throws exception
        error = false;
      } catch (Exception e) {
        System.out.println(e);
      }
    } while (error);
    System.out.println(username + name + password + confirmPassword);

    // Add to db
  }
}