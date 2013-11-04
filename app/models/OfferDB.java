package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import views.formdata.OfferFormData;

public class OfferDB {
  
private static Map<Student, Offer> buyOffers = new HashMap<>();
private static Map<Student, Offer> sellOffers = new HashMap<>();
  
  /**
   * Adds new buy offer to the database.
   * @param formData The offer data.
   * @return The offer.
   */
  public static void addBuyOffer(OfferFormData formData) {
    Student name = formData.student;
    Offer offer = new Offer(formData.student, formData.textbook, formData.price, formData.expiration, formData.id);
    buyOffers.put(name, offer);
  }
  
  /**
   * Gets the List of buy offers.
   * 
   * @return List of text books.
   */
  public static List<Offer> getBuyOffers() {
    return new ArrayList<>(buyOffers.values());
  }
  
 


}
