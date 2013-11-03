package views.formdata;

import java.util.ArrayList;
import java.util.List;
import play.data.validation.ValidationError;
import models.Textbook;

/**
 * Class that stored form data for textbook.
 * @author Owner
 *
 */
public class TextbookFormData {

  /** book title. */
  public String title = "";
  /** book author. */
  public String author = "";
  /** book ISBN. */
  public String ISBN = "";
  /** book image url. */
  public String imageURL = "";
  /** book condition. */
  public String condition = "";
  
  /**
   * Default constructor.
   */
  public TextbookFormData() {
    
  }
  
  /**
   * Constructor. 
   * 
   * @param title the book title.
   * @param author the book author.
   * @param ISBN the book isbn.
   * @param imageURL the book image url.
   * @param condition the book's condition.
   */
  public TextbookFormData(String title, String author, String ISBN, String imageURL, String condition) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.imageURL = imageURL;
    this.condition = condition;
  }
  
  /**
   * Constructor form textbook.
   * @param textbook the textbook.
   */
  public TextbookFormData(Textbook textbook) {
    this.title = textbook.getTitle();
    this.author = textbook.getAuthor();
    this.ISBN = textbook.getISBN();
    this.imageURL = textbook.getImageURL();
    this.condition = textbook.getCondition();
  }
  
  /**
   * Checks that form fields are valid. Called by bindFormRequest().
   * @return null if valid, a list of ValidationError if problem is found.
   */
  public List<ValidationError> validate()  {
    List<ValidationError> errors = new ArrayList<>();
    
    if (title.isEmpty()) {
      errors.add(new ValidationError("title", "Title is required."));
    }
    
    if (author.isEmpty()) {
      errors.add(new ValidationError("author", "Author is required."));
    }

    if (ISBN.isEmpty()) {
      errors.add(new ValidationError("iISBN", "ISBN is required."));
    }
    

    if (condition.isEmpty()) {
      errors.add(new ValidationError("condition", "Condition is required."));
    }
    
    //if (newlyCreated && StudentDB.emailExists(email)) {
    //  errors.add(new ValidationError("email", "email '" + email + "' already in use, duplicate emails not allowed."));
    //}
    
    return errors.isEmpty() ? null : errors;
  }
}
