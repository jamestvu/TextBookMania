package models;

import java.util.HashMap;
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
    Textbook textbook = new Textbook(formData.title, formData.author, formData.ISBN, formData.condition);
    textbooks.put(title, textbook);
    return textbook;
  }
  
  public static Textbook getTextbook(String ISBN) {
    Textbook textbook = textbooks.get(ISBN);
    if (textbook == null) {
      throw new RuntimeException("Invalid ISBN: " + ISBN);
    }
    return textbook;
  }
  
  public static boolean isbnExists(String ISBN) {
    return textbooks.containsKey(ISBN);
  }

  public static boolean titleExists(String title) {
    return textbooks.containsKey(title);
  }
  
  /**
   * Deletes a textbook by ISBN.
   * @param ISBN The book's ISBN.
   */
  public static void deleteTextbook(String ISBN) {
    textbooks.remove(ISBN);
  }

}
