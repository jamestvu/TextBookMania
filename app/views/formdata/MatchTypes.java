package views.formdata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.Student;
import models.StudentDB;

public class MatchTypes {
  
  private static List<Student> matchNames = StudentDB.getStudents();
  
  /**
   * Returns a map of all the condtionTypes.
   * @return The surfer type map.
   */
  public static Map<String, Boolean> getMatchNames() {
    Map<String, Boolean> typeMap = new HashMap<String, Boolean>();
    for (int i = 0; i < matchNames.size(); i++) {
      typeMap.put(matchNames.get(i).getFirstName(), true);
    }
    return typeMap;
  }
  
  /**
   * Sets a valid type and return the map.
   * @param surferType A string that will be set to a valid type.
   * @return Map A map of the valid surfer types.

  public static Map<String, Boolean> getTypes(String conditionType) {
    Map<String, Boolean> typeMap = ConditionTypes.getTypes();
    typeMap.put(conditionType, true);
    return typeMap;
  }
  
  /**
   * Returns true if the parameter is a valid type.
   * @param type The surfer type.
   * @return True if the type is valid.
  public static boolean isType(String type) {
    return ConditionTypes.getTypes().keySet().contains(type);
  }
  
  /**
   * Returns the list of conditions.
   * @return List of Surfers.
   
  public static List<String> getCondition() {
    return new ArrayList<>(Arrays.asList(types));
  }
   */
}
