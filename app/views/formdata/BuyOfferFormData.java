package views.formdata;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import play.data.validation.ValidationError;
import models.Offer;
import models.Student;
import models.Textbook;

public class BuyOfferFormData {

  public String student = null;
  public String textbook = null;
  public String price = null;
  public String expiration = null;
  /** The id. */
  public int id;
  
  /**
   * Default constructor
   */
  public BuyOfferFormData() {
  }
  
  public BuyOfferFormData(Offer formData) {
    this.student = formData.getStudent();
    this.textbook = formData.getTextbook();
    this.price = formData.getPrice();
    this.expiration = formData.getExpiration();
    this.id = formData.getId();
  }
  
  /**
   * Constructor.
   * @param student
   * @param textbook
   * @param price
   * @param date
   * @param id
   */
  public BuyOfferFormData(String student, String textbook, String price, String date, int id) {
    this.student = student;
    this.textbook = textbook;
    this.price = price;
    this.expiration = date;
    this.id = id;
  }
  
  /**
   * Checks that form fields are valid. Called by bindFormRequest().
   * @return null if valid, a list of ValidationError if problem is found.
   */
  public List<ValidationError> validate()  {
    List<ValidationError> errors = new ArrayList<>();
    
    if (student == null) {
      errors.add(new ValidationError("student", "Student is required."));
    }
    
    if (textbook == null) {
      errors.add(new ValidationError("textbook", "Textbook is required."));
    }
    
    if (price.isEmpty()) {
      errors.add(new ValidationError("price", "Price is required."));
    } 
    
    if (!price.matches("^[0-9]*$")) {
      errors.add(new ValidationError("price", "Price must be numeric."));
    }

    if (expiration.isEmpty()) {
      errors.add(new ValidationError("expiration", "Expiration is required."));
    }
    else {
      try {
        Date date = new SimpleDateFormat("MM/dd/yy").parse(expiration);
      }
      catch (ParseException e) {
        errors.add(new ValidationError("expiration", "Invalid Date Format."));
      }
    }
    
    return errors.isEmpty() ? null : errors;
  }
}
