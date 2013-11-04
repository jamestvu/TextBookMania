package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import views.formdata.SellOfferFormData;

/**
 * Provides a simple in memory repository for offer data.
 * @author Owner
 *
 */
public class SellOfferDB {
  
  private static Map<Textbook, Offer> offers = new HashMap<Textbook, Offer>();

  /**
   * Updates the repo with a new offer or edits an existing offer.
   * @param formData the offer form data to add.
   * @return offer the newly created offer to return.
   */
  public static Offer addOffer(SellOfferFormData formData) {
    Textbook book = formData.textbook;
    
    Offer offer = new Offer(formData.student, formData.textbook, formData.price, formData.expiration, formData.id);
    offers.put(book, offer);
    
    return offer;
  }
  
  /**
   * Deletes the offer from the repository.
   * @param book the book.
   */
  public static void deleteOffer(String book) {
    offers.remove(book);
  }
  
  
  /**
   * Returns the list of offers.
   * @return List of offers.
   */
  public static List<Offer> getOffers() {
    return new ArrayList<>(offers.values());
  }
  
  /**
   * Returns if the book is in use or not.
   * @param book The book to check.
   * @return True if a offer is already using the book.
   */
  public static boolean bookExists(String book) {
    return offers.containsKey(book);
  }
  
  /**
   * Returns a offer object.
   * @param book the book.
   * @return offer based on the book.
   */
  public static Offer getOffer(Textbook book) {
    Offer offer = offers.get(book);
    if (offer == null) {
      throw new RuntimeException("Passed an invalid offer: " + offer); 
    }
    return offer;
  }

}
