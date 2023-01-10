package org.aibles.exercise.service;

import java.util.ArrayList;
import java.util.List;

public class ProcessNumber {

  private static final int LIMIT_MIN_NUMBER_SEQUENCE = 10;
  private static final int LIMIT_MAX_NUMBER_SEQUENCE = 200;


  /**
   * method take a list after print each element of list
   *
   * @param showString
   */
  public static <T> void showString(String showString) {
    System.out.println(showString);
  }

    /**
     * build a string number follow request from list number
     * @param list
     * @return a string number
     * @param <T>
     */
  public static <T> String buildStringNumber(List<T> list) {
    StringBuilder result = new StringBuilder();
    for (T element : list) {
      if (element == list.get(list.size() - 1)) {
        result.append(element);
      } else {
        result.append(element).append(", ");
      }
    }
    return result.toString();
  }

  /**
   * method org.aibles.exercise.analysis a list array from 10 to 200 to find number divisibility for
   * 7 and not divisibility for 5
   *
   * @return a list number after org.aibles.exercise.analysis
   */
  public static List<String> analysisNumberSequence(int divisibilityNumber,
      int surplusRequestDivisibility, int unDivisibilityNumber, int surplusRequestUnDivisibility) {
    List<String> results = new ArrayList<>();
    for (int i = LIMIT_MIN_NUMBER_SEQUENCE; i <= LIMIT_MAX_NUMBER_SEQUENCE; i++) {
      if ((i % divisibilityNumber == surplusRequestDivisibility) && (i % unDivisibilityNumber
          != surplusRequestUnDivisibility)) {
        results.add(String.valueOf(i));
      }
    }
    return results;
  }

}
