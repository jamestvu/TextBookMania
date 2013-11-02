package controllers;

import models.Textbook;
import models.TextbookDB;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.StudentFormData;
import views.formdata.TextbookFormData;
import views.html.Index;
import views.html.Page1;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result page1() {
    return ok(Page1.render("Welcome to Page1."));
    
  }
  
  /**
   * Returns the manage student page.
   * @return The manage student page.
   */
  public static Result newStudent() {
    StudentFormData data = new StudentFormData();
    Form<StudentFormData> formData = Form.form(StudentFormData.class).fill(data);
    return ok(Page1.render("Welcome to Page1."));

  }
  
  /**
   * Returns add new textbook page.
   * @return The add textbook page.
   */
  public static Result newTextbook() {
    TextbookFormData data = new TextbookFormData();
    Form<TextbookFormData> formData = Form.form(TextbookFormData.class).fill(data);
    return ok(Page1.render("returns add new text page, temp"));
  }
  
  public static Result getTextbook(String ISBN) {
    TextbookDB.getTextbook(ISBN);
    return ok(Page1.render("returns the textbook based on ISBN, temp"));
  }
  
  public static Result deleteTextbook(String ISBN) {
    TextbookDB.deleteTextbook(ISBN);
    return ok(Page1.render("returns to the index, temp"));
  }
  
  public static Result manageTextbook(String ISBN) {
    TextbookFormData data = new TextbookFormData(TextbookDB.getTextbook(ISBN));
    Form<TextbookFormData> formData = Form.form(TextbookFormData.class).fill(data);
    return ok(Page1.render("returns edit textbook page, temp"));
  }
}
