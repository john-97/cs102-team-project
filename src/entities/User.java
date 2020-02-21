package entities;

public class User {
  private String username;
  private String name;
  private String password;
  public User(String username, String name, String password) {
    this.username = username;
    this.name = name;
    this.password = password;
  }
  public String getUsername() {
    return this.username;
  }
  public String getName() {
    return this.name;
  }
  public String getPassword() {
    return this.password;
  }

}