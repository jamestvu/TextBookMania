package models;

import java.util.Date;


public class Offer {

  private String student;
  private String textbook;
  private String price;
  private String expiration;
  private int id;
  
  public Offer() {
    
  }
  
  public Offer(String student, String textbook, String price, String expiration, int id) {
    this.student = student;
    this.textbook = textbook;
    this.price = price;
    this.expiration = expiration;
    this.id = id;
  }

  /**
   * @return the student
   */
  public String getStudent() {
    return student;
  }

  /**
   * @param student the student to set
   */
  public void setStudent(String student) {
    this.student = student;
  }

  /**
   * @return the textbook
   */
  public String getTextbook() {
    return textbook;
  }

  /**
   * @param String the String to set
   */
  public void setTextbook(String textbook) {
    this.textbook = textbook;
  }

  /**
   * @return the price
   */
  public String getPrice() {
    return price;
  }

  /**
   * @param price the price to set
   */
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * @return the expiration
   */
  public String getExpiration() {
    return expiration;
  }

  /**
   * @param expiration the expiration to set
   */
  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

  /**
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }
}
