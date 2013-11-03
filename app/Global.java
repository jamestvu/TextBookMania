
import play.Application;
import play.GlobalSettings;
import views.formdata.StudentFormData;
import views.formdata.TextbookFormData;
import models.StudentDB;
import models.TextbookDB;


/**
 * Overrides the startup.
 * @author Owner
 *
 */
public class Global extends GlobalSettings {
  
  /**
   * Initializes the surfers upon startup.
   * @param app The application.
   */
  public void onStart(Application app) {
    
    StudentDB.addStudent(new StudentFormData("Jonathan", "Ortal", "jortal@hawaii.edu",
        "http://jortal.files.wordpress.com/2013/08/profilepic.jpg?w=133&h=105"));
    StudentDB.addStudent(new StudentFormData("Marc", "Sanpei", "sanpeihawaii2@gmail.com", 
        "http://sanpeimarc.files.wordpress.com/2013/08/215078_10150723796135713_735286_n.jpg?w=960"));
    StudentDB.addStudent(new StudentFormData("James", "Vu", "jamesvu42@gmail.com",
        "http://jamestvu.files.wordpress.com/2013/08/dsc01094.jpg?w=150"));
    
    TextbookDB.addTextbook(new TextbookFormData("Java Concepts: Compatible with Java 5, 6 and 7",
        "Cay S. Horstmann", "0470509473", "http://images.amazon.com/images/P/0470509473", "Excellent"));
    TextbookDB.addTextbook(new TextbookFormData("Discrete Mathematics and Its Applications ", 
        "Kenneth Rosen", "0073383090", "http://images.amazon.com/images/P/0073383090", "Excellent"));        
    TextbookDB.addTextbook(new TextbookFormData("Data Structures: Abstraction and Design Using Java",
        "Elliot B. Koffman; Paul A. T. Wolfgang", "0470128704", "http://images.amazon.com/images/P/0470128704", "Excellent"));
    TextbookDB.addTextbook(new TextbookFormData("C Programming Language (2nd Edition)",
         "Brian W. Kernighan , Dennis M. Ritchie", "0131103628", "http://images.amazon.com/images/P/0131103628", "Excellent"));
    TextbookDB.addTextbook(new TextbookFormData("C++ Primer Plus (6th Edition) (Developer's Library)", 
        "Stephen Prata", "9780321776402", "http://images.amazon.com/images/P/9780321776402", "Excellent"));
    TextbookDB.addTextbook(new TextbookFormData("The C Programming Language: ANSI C Version", 
        "Brian W. Kernighan", "0131103628", "http://images.amazon.com/images/P/0131103628", "Excellent"));
    TextbookDB.addTextbook(new TextbookFormData("Introduction to Algorithms", 
        "Thomas H. Cormen, Charles E. Leiserson", "0262033844", "http://images.amazon.com/images/P/0262033844", "Excellent"));
    TextbookDB.addTextbook(new TextbookFormData("Programming Language Pragmatics", 
        "Michael L. Scott", "0123745144", "http://images.amazon.com/images/P/0123745144", "Excellent"));
    TextbookDB.addTextbook(new TextbookFormData("Land of Lisp: Learn to Program in Lisp, One Game at a Time!", 
        "Conrad Barski", "1593272812", "http://images.amazon.com/images/P/1593272812", "Excellent"));
    TextbookDB.addTextbook(new TextbookFormData("Database Systems: A Comprehensive Overview and Int",
        "Jeffrey D. Ullman, Hector Garcia-Molina, Jennifer D. Widom", "0131873253", 
        "http://images.amazon.com/images/P/0131873253", "Excellent"));
    TextbookDB.addTextbook(new TextbookFormData("Digital Logic Design: A Rigorous Approach", 
        "Guy Even, Moti Medina", "1107027535", "http://images.amazon.com/images/P/1107027535", "Excellent"));
    TextbookDB.addTextbook(new TextbookFormData("Ethics for the Information Age (5th Edition)",
<<<<<<< HEAD
        "Mike Quinn", "9780132855532", "http://img.png", "Condition"));
    TextbookDB.addTextbook(
        new TextbookFormData("Presenting to Win: The Art of Telling Your Story, Updated and Expanded Edition", 
        "Jerry Weissman", "9780137144174", "http://img.png", "Condition"));
=======
        "Mike Quinn", "0132855534", "http://images.amazon.com/images/P/0132855534", "Excellent"));
    TextbookDB.addTextbook(new TextbookFormData("Presenting to Win: The Art of Telling Your Story, Updated and Expanded Edition", 
        "Jerry Weissman", "0137144172", "http://images.amazon.com/images/P/0137144172", "Excellent"));
>>>>>>> 7f245e6c709bfe117b3dcf7a729209585da633fe
    TextbookDB.addTextbook(new TextbookFormData("Operating System Concepts (Hardcover)", 
        "Abraham Silberschatz, Peter B. Galvin, Greg Gagne", "1118063333", 
        "http://images.amazon.com/images/P/1118063333", "Excellent"));
    TextbookDB.addTextbook(new TextbookFormData("Operating System Concepts (Looseleaf)", 
        "Abraham Silberschatz, Peter B. Galvin, Greg Gagne", "9781118129388", 
        "http://images.amazon.com/images/P/9781118129388", "Excellent"));
    TextbookDB.addTextbook(new TextbookFormData("Emotional Design: Why We Love (or Hate) Everyday Things",
        "Donald Norman", "0465051367", "http://images.amazon.com/images/P/0465051367", "Excellent"));
    TextbookDB.addTextbook(new TextbookFormData("The Design of Everyday Things", 
        "Donald A. Norman", "0465067107", "http://images.amazon.com/images/P/0465067107", "Excellent"));
    TextbookDB.addTextbook(new TextbookFormData("Artificial Intelligence for Games", 
        "Ian Millington, John Funge", "0123747317", "http://images.amazon.com/images/P/0123747317", "Excellent"));

  }  
}