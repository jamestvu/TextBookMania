package models;

/**
 * Object that holds data on a student.
 * @author Owner
 *
 */
public class Student {
  
  private String firstName;
  private String lastName;
  private String email;
  private String imageURL;
  
  /** Default constructor. **/
  public Student() {
    
  }
  
  /**
   * Constructor to initialize values.
   * 
   * @param firstName the first name.
   * @param lastName the last name.
   * @param email the email
   * @param imageURL the image url.
   */
  public Student(String firstName, String lastName, String email, String imageURL) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.imageURL = imageURL;
  }
  /**
   * @return the firstName
   */
  public String getFirstName() {
    return firstName;
  }
  /**
   * @param firstName the firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  /**
   * @return the lastName
   */
  public String getLastName() {
    return lastName;
  }
  /**
   * @param lastName the lastName to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }
  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }
  /**
   * @return the imageURL
   */
  public String getImageURL() {
    return imageURL;
  }
  /**
   * @param imageURL the imageURL to set
   */
  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

}