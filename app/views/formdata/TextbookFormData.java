package views.formdata;

import java.util.ArrayList;
import java.util.List;
import play.data.validation.ValidationError;
import models.Textbook;

public class TextbookFormData {

  /** book title */
  public String title = "";
  /** book author */
  public String author = "";
  /** book ISBN */
  public String ISBN = "";
  /** book condition */
  public String condition = "";
  
  /**
   * Default constructor
   */
  public TextbookFormData() {
    
  }
  
  public TextbookFormData(String title, String author, String ISBN, String condition) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.condition = condition;
  }
  
  public TextbookFormData(Textbook textbook) {
    this.title = textbook.getTitle();
    this.author = textbook.getAuthor();
    this.ISBN = textbook.getISBN();
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
