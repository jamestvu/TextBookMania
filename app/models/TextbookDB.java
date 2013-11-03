package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import views.formdata.TextbookFormData;

/**
 * Class that stores a DB of textbooks.
 *
 */
public class TextbookDB {
  
  private static Map<String, Textbook> textbooks = new HashMap<>();
  
  /**
   * Adds new textbook to the database.
   * @param formData The textbook data.
   * @return The textbook.
   */
  public static Textbook addTextbook(TextbookFormData formData) {
    String title = formData.title;
<<<<<<< HEAD
    Textbook textbook = new Textbook(formData.title, formData.author, formData.ISBN, formData.imageURL, 
        formData.condition);
=======
    Textbook textbook = new Textbook(formData.title, formData.author, formData.isbn, formData.imageURL, formData.condition);
>>>>>>> 7f245e6c709bfe117b3dcf7a729209585da633fe
    textbooks.put(title, textbook);
    return textbook;
  }
  
  /**
   * Gets the List of textbooks.
   * 
   * @return List of text books.
   */
  public static List<Textbook> getTextbooks() {
    return new ArrayList<>(textbooks.values());
  }
  
<<<<<<< HEAD
  /**
   * Gets a textbook based on ISBN.
   * @param ISBN the isbn.
   * @return textbook the textbook to return.
   */
  public static Textbook getTextbook(String ISBN) {
    Textbook textbook = textbooks.get(ISBN);
=======
  public static Textbook getTextbook(String title) {
    Textbook textbook = textbooks.get(title);
>>>>>>> 7f245e6c709bfe117b3dcf7a729209585da633fe
    if (textbook == null) {
      throw new RuntimeException("Invalid title: " + title);
    }
    return textbook;
  }
  
<<<<<<< HEAD
  /**
   * Checks exixtence of a textbook based on isbn.
   * @param ISBN the isbn.
   * @return true is textbook exists in the db.
   */
  public static boolean isbnExists(String ISBN) {
    return textbooks.containsKey(ISBN);
=======
  public static boolean isbnExists(String isbn) {
    return textbooks.containsKey(isbn);
>>>>>>> 7f245e6c709bfe117b3dcf7a729209585da633fe
  }
  
  /**
   * Checks DB for a textbook title.
   * @param title the book title.
   * @return true if title exists.
   */
  public static boolean titleExists(String title) {
    return textbooks.containsKey(title);
  }
  
  /**
   * Checks db if image exists.
   * @param image the book image.
   * @return true if db contains the image.
   */
  public static boolean imageExists(String image) {
    return textbooks.containsKey(image);
  }
  
  /**
   * Deletes a textbook by title.
   * @param title the book title.
   */
  public static void deleteTextbook(String title) {
    textbooks.remove(title);
  }

}
