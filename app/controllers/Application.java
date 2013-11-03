package controllers;

import models.StudentDB;
import models.TextbookDB;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.StudentFormData;
import views.formdata.TextbookFormData;
import views.html.Index;
import views.html.ListStudents;
import views.html.ListTextbooks;
import views.html.ManageStudent;
import views.html.ManageTextbook;

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
   * Returns the manage student page.
   * @return The manage student page.
   */
  public static Result newStudent() {
    StudentFormData data = new StudentFormData();
    Form<StudentFormData> formData = Form.form(StudentFormData.class).fill(data);
    return ok(ManageStudent.render(formData));
  }
  
  public static Result listStudents() {
    return ok(ListStudents.render(StudentDB.getStudents()));
  }
  
  public static Result deleteStudent(String email) {
    StudentDB.deleteStudent(email);
    return ok(ListStudents.render(StudentDB.getStudents()));
  }

  public static Result listTextbooks() {
    return ok(ListTextbooks.render(TextbookDB.getTextbooks()));
  }
  
  /**
   * Returns add new textbook page.
   * @return The add textbook page.
   */
  public static Result newTextbook() {
    TextbookFormData data = new TextbookFormData();
    Form<TextbookFormData> formData = Form.form(TextbookFormData.class).fill(data);
    return ok(ManageTextbook.render(formData));
  }
  
  public static Result getTextbook(String title) {
    TextbookDB.getTextbook(title);
    return ok(Index.render("returns the textbook based on title, temp"));
  }
  
  public static Result deleteTextbook(String title) {
    TextbookDB.deleteTextbook(title);
    return ok(ListTextbooks.render(TextbookDB.getTextbooks()));
  }
  
  public static Result manageTextbook(String title) {
    TextbookFormData data = new TextbookFormData(TextbookDB.getTextbook(title));
    Form<TextbookFormData> formData = Form.form(TextbookFormData.class).fill(data);
    return ok(Index.render("returns edit textbook page, temp"));
  }
  
  public static Result postStudent() {
    Form<StudentFormData> formData = Form.form(StudentFormData.class).bindFromRequest();
    if (formData.hasErrors()) {
      return badRequest(Index.render("returns page with errors, temp"));
    }
    else {
      StudentFormData data = formData.get();
      StudentDB.addStudent(data);
      return ok(Index.render("returns textbook page, temp"));
    }
  }  
  
  public static Result postTextbook() {
    Form<TextbookFormData> formData = Form.form(TextbookFormData.class).bindFromRequest();
    if (formData.hasErrors()) {
      return badRequest(Index.render("returns page with errors, temp"));
    }
    else {
      TextbookFormData data = formData.get();
      TextbookDB.addTextbook(data);
      return ok(Index.render("returns textbook page, temp"));
    }
  }
}
