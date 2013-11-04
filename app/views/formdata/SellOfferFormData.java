package views.formdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import play.data.validation.ValidationError;
import models.Offer;
import models.Student;
import models.Textbook;

public class SellOfferFormData {

  public Student student = null;
  public Textbook textbook = null;
  public int price = 0;
  public Date expiration = null;
  public int id;
  
  /**
   * Default constructor
   */
  public SellOfferFormData() {
  }
  
  public SellOfferFormData(Offer formData) {
    this.student = formData.getStudent();
    this.textbook = formData.getTextbook();
    this.price = formData.getPrice();
    this.expiration = formData.getExpiration();
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
      errors.add(new ValidationError("condition", "Expiration is required."));
    }
    
    return errors.isEmpty() ? null : errors;
  }
}
