package views.formdata;

import java.util.Date;
import models.Offer;
import models.Student;
import models.Textbook;

public class SellOffer {

  public Student student = null;
  public Textbook textbook = null;
  public int price = 0;
  public Date expiration = null;
  
  /**
   * Default constructor
   */
  public SellOffer() {
  }
  
  public SellOffer(Offer formData) {
    this.student = formData.getStudent();
    this.textbook = formData.getTextbook();
    this.price = formData.getPrice();
    this.expiration = formData.getExpiration();
  }
  
  //validate
}
