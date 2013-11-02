package views.formdata;

import java.util.HashMap;
import java.util.Map;


/**
 * Class that declares surfer types.
 * @author Owner
 *
 */
public class SurferTypes {
  
  private static String[] types = {"Male", "Female", "Grom"};
  
  /**
   * Returns a map of all the surferTypes.
   * @return The surfer type map.
   */
  public static Map<String, Boolean> getTypes() {
    Map<String, Boolean> typeMap = new HashMap<String, Boolean>();
    for (String type: types) {
      typeMap.put(type,  false);
    }
    return typeMap;
  }
  
  /**
   * Sets a valid type and return the map.
   * @param surferType A string that will be set to a valid type.
   * @return Map A map of the valid surfer types.
   */
  public static Map<String, Boolean> getTypes(String surferType) {
    Map<String, Boolean> typeMap = SurferTypes.getTypes();
    typeMap.put(surferType, true);
    return typeMap;
  }
  
  /**
   * Returns true if the parameter is a valid type.
   * @param type The surfer type.
   * @return True if the type is valid.
   */
  public static boolean isType(String type) {
    return SurferTypes.getTypes().keySet().contains(type);
  }
  

}
