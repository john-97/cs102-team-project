package entities.post;

import java.util.Date;
import entities.User;

public class Reply {
  private Date date;
  private User user;
  private String reply;
  public Reply(Date date, User user, String reply) {
    this.date = date;
    this.user = user;
    this.reply = reply;
  }
  public Date getDate() {
    return this.date;
  }
  public User getUser() {
    return this.user;
  }
  public String getReply() {
    return this.reply;
  }
}