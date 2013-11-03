package models;


public class Offer {

  private Student student;
  private Textbook textbook ;
  private int price;
  private String expiration;
  
  public Offer() {
    
  }
  
  public Offer(Student student, Textbook textbook, int price, String expiration) {
    this.student = student;
    this.textbook = textbook;
    this.price = price;
    this.expiration = expiration;
  }

  /**
   * @return the student
   */
  public Student getStudent() {
    return student;
  }

  /**
   * @param student the student to set
   */
  public void setStudent(Student student) {
    this.student = student;
  }

  /**
   * @return the textbook
   */
  public Textbook getTextbook() {
    return textbook;
  }

  /**
   * @param textbook the textbook to set
   */
  public void setTextbook(Textbook textbook) {
    this.textbook = textbook;
  }

  /**
   * @return the price
   */
  public int getPrice() {
    return price;
  }

  /**
   * @param price the price to set
   */
  public void setPrice(int price) {
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
}
