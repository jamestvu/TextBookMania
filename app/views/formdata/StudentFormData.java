package views.formdata;

import java.util.ArrayList;
import java.util.List;
import models.Student;
import models.StudentDB;
import play.data.validation.ValidationError;

/**
 * Stores the Contact form data object.
 * 
 * @author Owner
 *
 */
public class StudentFormData {
  
  /** The first name. */
  public String firstName = "";
  /** The last name. */
  public String lastName = "";
  /** The email. */
  public String email = "";
  /** The carousel URL.*/
  public String imageURL = "";

  /** Checks if the email was created or edited. */
  public boolean newlyCreated = true;
  
  /**
   * Default Constructor.
   */
  public StudentFormData() {
  }
  
  /**
   * Constructor to initialize values.
   * 
   * @param firstName the first name.
   * @param lastName the last name.
   * @param email the email
   * @param imageURL the image url.
   */
  public StudentFormData(String firstName, String lastName, String email, String imageURL) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.imageURL = imageURL;
  }
  
  /**
   * Creates a Surfer Form Data object based a surfer object.
   * @param formData
   * @param formData the form data.
   */
  public StudentFormData(Student formData) {
    this.firstName = formData.getFirstName();
    this.lastName = formData.getLastName();
    this.email = formData.getEmail();
    this.imageURL = formData.getImageURL();

  }
  
  /**
   * Checks that form fields are valid. Called by bindFormRequest().
   * @return null if valid, a list of ValidationError if problem is found.
   */
  public List<ValidationError> validate()  {
    List<ValidationError> errors = new ArrayList<>();
    
    if (firstName.isEmpty()) {
      errors.add(new ValidationError("firstName", "First Name is required."));
    }
    
    if (lastName.isEmpty()) {
      errors.add(new ValidationError("lastName", "Last Name is required."));
    }

    if (imageURL.isEmpty()) {
      errors.add(new ValidationError("imageURL", "Image URL is required."));
    }
    

    if (email.isEmpty()) {
      errors.add(new ValidationError("email", "Email field is required."));
    }
    
    if (newlyCreated && StudentDB.emailExists(email)) {
      errors.add(new ValidationError("email", "email '" + email + "' already in use, duplicate emails not allowed."));
    }
    
    /*
    if (!SurferTypes.isType(type)) {
      errors.add(new ValidationError("type", "Please select a surfer type."));
    }
    */
    
    return errors.isEmpty() ? null : errors;
  }
}
