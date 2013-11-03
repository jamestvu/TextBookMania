package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import views.formdata.TextbookFormData;

public class TextbookDB {
  
  private static Map<String, Textbook> textbooks = new HashMap<>();
  
  /**
   * Adds new textbook to the database.
   * @param formData The textbook data.
   * @return The textbook.
   */
  public static Textbook addTextbook(TextbookFormData formData) {
    String title = formData.title;
    Textbook textbook = new Textbook(formData.title, formData.author, formData.isbn, formData.imageURL, formData.condition);
    textbooks.put(title, textbook);
    return textbook;
  }
  
  public static List<Textbook> getTextbooks() {
    return new ArrayList<>(textbooks.values());
  }
  
  public static Textbook getTextbook(String title) {
    Textbook textbook = textbooks.get(title);
    if (textbook == null) {
      throw new RuntimeException("Invalid title: " + title);
    }
    return textbook;
  }
  
  public static boolean isbnExists(String isbn) {
    return textbooks.containsKey(isbn);
  }

  public static boolean titleExists(String title) {
    return textbooks.containsKey(title);
  }
  
  public static boolean imageExists(String image) {
    return textbooks.containsKey(image);
  }
  
  /**
   * Deletes a textbook by ISBN.
   * @param ISBN The book's ISBN.
   */
  public static void deleteTextbook(String title) {
    textbooks.remove(title);
  }

}
