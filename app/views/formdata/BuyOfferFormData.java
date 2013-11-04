package views.formdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import play.data.validation.ValidationError;
import models.Offer;
import models.Student;
import models.Textbook;

public class BuyOfferFormData {

  public Student student = null;
  public Textbook textbook = null;
  public int price = 0;
  public Date expiration = null;
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
  
  public BuyOfferFormData(Student student, Textbook textbook, int price, Date date, int id) {
    this.student = student;
    this.textbook = textbook;
    this.price = price;
    this.expiration = date;
    this.id = id;
  }
  
  public BuyOfferFormData(Student student, Textbook textbook, int price, Date date) {
    this.student = student;
    this.textbook = textbook;
    this.price = price;
    this.expiration = date;
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

    if (price == 0) {
      errors.add(new ValidationError("price", "Price is required."));
    } 
    

    if (expiration == null) {
      errors.add(new ValidationError("expiration", "Expiration is required."));
    }
    
    return errors.isEmpty() ? null : errors;
  }
}
