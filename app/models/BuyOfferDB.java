package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import views.formdata.BuyOfferFormData;

/**
 * Provides a simple in memory repository for offer data.
 * @author Owner
 *
 */
public class BuyOfferDB {
  
  private static Map<Integer, Offer> offers = new HashMap<Integer, Offer>();

  /**
   * Updates the repo with a new offer or edits an existing offer.
   * @param formData the offer form data to add.
   * @return offer the newly created offer to return.
   */
  public static Offer addOffer(BuyOfferFormData formData) {
    Offer offer = new Offer(formData.student, formData.textbook, formData.price, formData.expiration, formData.id);
    offers.put(formData.id, offer);
    
    return offer;
  }
  
  /**
   * Deletes the offer from the repository.
   * @param book the book.
   */
  public static void deleteOffer(int book) {
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
   * @param id the book.
   * @return offer based on the id.
   */
  public static Offer getOffer(int id) {
    Offer offer = offers.get(id);
    if (offer == null) {
      throw new RuntimeException("Passed an invalid offer: " + offer); 
    }
    return offer;
  }

}
