package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import views.formdata.StudentFormData;

/**
 * Provides a simple in memory repository for student data.
 * @author Owner
 *
 */
public class StudentDB {
  
  private static Map<String, Student> students = new HashMap<String, Student>();

  /**
   * Updates the repo with a new student or edits an existing student.
   * @param formData the student form data to add.
   * @return student the newly created student to return.
   */
  public static Student addStudent(StudentFormData formData) {
    String email = formData.email;
    
    Student student = new Student(formData.firstName, formData.lastName, formData.email, formData.imageURL);
    students.put(email, student);
    
    return student;
  }
  
  /**
   * Deletes the student from the repository.
   * @param email the email.
   */
  public static void deleteStudent(String email) {
    students.remove(email);
  }
  
  
  /**
   * Returns the list of students.
   * @return List of students.
   */
  public static List<Student> getStudents() {
    return new ArrayList<>(students.values());
  }
  
  /**
   * Returns if the email is in use or not.
   * @param email The email to check.
   * @return True if a student is already using the email.
   */
  public static boolean emailExists(String email) {
    return students.containsKey(email);
  }
  
  /**
   * Returns a student object.
   * @param email the email.
   * @return student based on the email.
   */
  public static Student getStudent(String email) {
    Student student = students.get(email);
    if (student == null) {
      throw new RuntimeException("Passed an invalid email: " + email); 
    }
    return student;
  }

}
