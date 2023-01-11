package org.aibles.exercise.service;

import java.util.ArrayList;
import java.util.List;

public class ProcessNumberService {

  /**
   * method take a list after print each element of list
   *
   * @param showString
   */
  public static void showString(String showString) {
    System.out.println(showString);
  }

  /**
   * build a string number follow request from list number
   *
   * @param list
   * @return a string number
   */
  public static String toString(List<String> list) {
    StringBuilder result = new StringBuilder();
    for (String element : list) {
      result.append(element).append(", ");
    }
    result.replace(result.length() - 2, result.length() - 1, "");
    return result.toString();
  }

  /**
   * method org.aibles.exercise.analysis a list array from 10 to 200 to find number divisibility for
   * * 7 and not divisibility for 5
   *
   * @param divisibilityNumber
   * @param surplusRequestDivisibility
   * @param unDivisibilityNumber
   * @param surplusRequestUnDivisibility
   * @return a list number after org.aibles.exercise.analysis
   */
  public static List<String> searchNumberSatisfy(int divisibilityNumber,
      int surplusRequestDivisibility, int unDivisibilityNumber, int surplusRequestUnDivisibility,
      int limitMin, int limitMax) {
    List<String> results = new ArrayList<>();
    for (int i = limitMin; i <= limitMax; i++) {
      if ((i % divisibilityNumber == surplusRequestDivisibility) && (i % unDivisibilityNumber != surplusRequestUnDivisibility)) {
        results.add(String.valueOf(i));
      }
    }
    return results;
  }

}
