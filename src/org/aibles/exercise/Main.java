package org.aibles.exercise;

import java.util.Scanner;
import org.aibles.exercise.service.ProcessNumber;

public class Main {

  public static void main(String[] args) {
    while (true) {
      Scanner scanner = new Scanner(System.in);
      var checkRun = scanner.next();
      if (checkRun.contains("quit")) break;
      System.out.println("Enter divisibilityNumber:");
      var divisibilityNumber = Integer.parseInt(scanner.next());
      System.out.println("Enter surplusRequestDivisibility:");
      var surplusRequestDivisibility = Integer.parseInt(scanner.next());
      System.out.println("Enter unDivisibilityNumber:");
      var unDivisibilityNumber = Integer.parseInt(scanner.next());
      System.out.println("Enter surplusRequestUnDivisibility:");
      var surplusRequestUnDivisibility = Integer.parseInt(scanner.next());
      var stringNumber = ProcessNumber.buildStringNumber(
          ProcessNumber.analysisNumberSequence(divisibilityNumber, surplusRequestDivisibility,
              unDivisibilityNumber, surplusRequestUnDivisibility));
      ProcessNumber.showString(stringNumber);
    }
  }

}