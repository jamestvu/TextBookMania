package models;

public class Textbook {
  
  private String title;
  private String author;
  private String isbn;
  private String imageURL;
  private String condition;
  
  /**
   * default constructor.
   */
  public Textbook() {
    //default constructor
  }
  
  /**
   * Constructor.
   * @param title
   * @param author
   * @param ISBN
   */
  public Textbook(String title, String author, String isbn, String imageURL, String condition) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.imageURL = imageURL;
    this.condition = condition;
  }

  /**
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @param title the title to set
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * @return the author
   */
  public String getAuthor() {
    return author;
  }

  /**
   * @param author the author to set
   */
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   * @return the isbn
   */
  public String getISBN() {
    return isbn;
  }

  /**
   * @param iSBN the iSBN to set
   */
  public void setISBN(String isbn) {
    this.isbn = isbn;
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

  /**
   * @return the condition
   */
  public String getCondition() {
    return condition;
  }

  /**
   * @param condition the condition to set
   */
  public void setCondition(String condition) {
    this.condition = condition;
  }

}
