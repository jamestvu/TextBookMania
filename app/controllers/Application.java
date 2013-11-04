package controllers;

import java.util.Map;
import models.BuyOfferDB;
import models.SellOfferDB;
import models.StudentDB;
import models.TextbookDB;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.BuyOfferFormData;
import views.formdata.MatchTypes;
import views.formdata.ConditionTypes;
import views.formdata.SellOfferFormData;
import views.formdata.StudentFormData;
import views.formdata.TextbookFormData;
import views.html.Index;
import views.html.ListStudents;
import views.html.ListTextbooks;
import views.html.ManageBuyOffer;
import views.html.ManageStudent;
import views.html.ManageTextbook;
import views.html.ListBuyOffers;
import views.html.Match;

import views.html.ListSellOffers;
import views.html.ManageSellOffer;
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
    
  public static Result matchPage() {
    StudentFormData data = new StudentFormData();
    Form<StudentFormData> formData = Form.form(StudentFormData.class).fill(data);    
    Map<String, Boolean> matchTypes = MatchTypes.getMatchNames();
    return ok(Match.render(formData, matchTypes));
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
  
  public static Result listBuyOffers() {
    return ok(ListBuyOffers.render(""));
  }
  
  public static Result getBuyOffer(int id) {
    BuyOfferDB.getOffer(id);
    return ok(Index.render("returns the textbook based on title, temp"));
  }
  
  public static Result manageBuyOffer(int id) {
    BuyOfferFormData data = new BuyOfferFormData(BuyOfferDB.getOffer(id));
    Form<BuyOfferFormData> formData = Form.form(BuyOfferFormData.class).fill(data);
    return ok(Index.render("returns the textbook based on title, temp"));
    //return ok(ManageBuyOffer.render(formData, StudentDB.getStudents(), TextbookDB.getTextbooks()));
  }
  
  public static Result deleteBuyOffer(int id) {
    BuyOfferDB.deleteOffer(id);
    return ok(ListBuyOffers.render(""));
  }
  
  //////////////////////Sell Offers////////////////////////////////
  public static Result listSellOffers() {
    return ok(ListSellOffers.render(""));
  }
  
  public static Result newSellOffer() {
    SellOfferFormData data = new SellOfferFormData();
    Form<SellOfferFormData> formData = Form.form(SellOfferFormData.class).fill(data);
    return ok(ManageSellOffer.render(formData));
  }
  
  public static Result getSellOffer(int id) {
    SellOfferDB.getOffer(id);
    return ok(Index.render("returns the textbook based on title, temp"));
  }
  
  public static Result manageSellOffer(int id) {
    SellOfferFormData data = new SellOfferFormData(SellOfferDB.getOffer(id));
    Form<SellOfferFormData> formData = Form.form(SellOfferFormData.class).fill(data);
    return ok(Index.render("returns the textbook based on title, temp"));
    //return ok(ManageSellOffer.render(formData, StudentDB.getStudents(), TextbookDB.getTextbooks()));
  }
  
  public static Result deleteSellOffer(int id) {
    SellOfferDB.deleteOffer(id);
    return ok(ListSellOffers.render(""));
  }
  ////////////////////////////////Sell Offers///////////////////////
  /**
   * Returns add new textbook page.
   * @return The add textbook page.
   */
  public static Result newTextbook() {
    TextbookFormData data = new TextbookFormData();
    Form<TextbookFormData> formData = Form.form(TextbookFormData.class).fill(data);
    return ok(ManageTextbook.render(formData,ConditionTypes.getTypes()));
  }
  
  public static Result newBuyOffer() {
    BuyOfferFormData data = new BuyOfferFormData();
    Form<BuyOfferFormData> formData = Form.form(BuyOfferFormData.class).fill(data);
    return ok(ManageBuyOffer.render(formData));
  }
  
  public static Result getTextbook(String title) {
    TextbookDB.getTextbook(title);
    return ok(Index.render("returns the textbook based on title, temp"));
  }
  
  public static Result deleteTextbook(String title) {
    TextbookDB.deleteTextbook(title);
    return ok(ListTextbooks.render(TextbookDB.getTextbooks()));
  }
  
  public static Result manageStudent(String email) {
    StudentFormData data = new StudentFormData(StudentDB.getStudent(email));
    Form<StudentFormData> formData = Form.form(StudentFormData.class).fill(data);
    return ok(ManageStudent.render(formData));
  }
  
  public static Result manageTextbook(String title) {
    TextbookFormData data = new TextbookFormData(TextbookDB.getTextbook(title));
    Form<TextbookFormData> formData = Form.form(TextbookFormData.class).fill(data);
    return ok(ManageTextbook.render(formData,ConditionTypes.getTypes()));
  }
  
  public static Result postStudent() {
    Form<StudentFormData> formData = Form.form(StudentFormData.class).bindFromRequest();
    if (formData.hasErrors()) {
      return badRequest(ManageStudent.render(formData));
    }
    else {
      StudentFormData data = formData.get();
      StudentDB.addStudent(data);
      return ok(ListStudents.render(StudentDB.getStudents()));
    }
  }  
  
  public static Result postTextbook() {
    Form<TextbookFormData> formData = Form.form(TextbookFormData.class).bindFromRequest();
    if (formData.hasErrors()) {
      return badRequest(ManageTextbook.render(formData,ConditionTypes.getTypes()));
    }
    else {
      TextbookFormData data = formData.get();
      TextbookDB.addTextbook(data);
      return ok(ListTextbooks.render(TextbookDB.getTextbooks()));
    }
  }
  
  public static Result postBuyOffer() {
    Form<BuyOfferFormData> formData = Form.form(BuyOfferFormData.class).bindFromRequest();
    if (formData.hasErrors()) {
      return badRequest(ManageBuyOffer.render(formData));
    }
    else {
      BuyOfferFormData data = formData.get();
      BuyOfferDB.addOffer(data);
      return ok(ManageBuyOffer.render(formData));
    }
  }
  
  public static Result postSellOffer() {
    Form<SellOfferFormData> formData = Form.form(SellOfferFormData.class).bindFromRequest();
    if (formData.hasErrors()) {
      return badRequest(ManageSellOffer.render(formData));
    }
    else {
      SellOfferFormData data = formData.get();
      SellOfferDB.addOffer(data);
      return ok(ManageSellOffer.render(formData));
    }
  }
}
