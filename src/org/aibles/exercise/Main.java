package org.aibles.exercise;

import java.util.List;
import java.util.Scanner;
import org.aibles.exercise.service.ProcessNumberService;

public class Main {

  public static void main(String[] args) {
    while (true) {
      try {
        Scanner scanner = new Scanner(System.in);
        var checkRun = scanner.next();
        if (checkRun.contains("quit"))
          break;
        System.out.println("Enter divisibilityNumber:");
        var divisibilityNumber = Integer.parseInt(scanner.next());
        System.out.println("Enter surplusRequestDivisibility:");
        var surplusRequestDivisibility = Integer.parseInt(scanner.next());
        System.out.println("Enter unDivisibilityNumber:");
        var unDivisibilityNumber = Integer.parseInt(scanner.next());
        System.out.println("Enter surplusRequestUnDivisibility:");
        var surplusRequestUnDivisibility = Integer.parseInt(scanner.next());
        List<String> numbersSatisfy = ProcessNumberService.searchNumberSatisfy(divisibilityNumber,
            surplusRequestDivisibility,
            unDivisibilityNumber, surplusRequestUnDivisibility, 10, 200);
        var stringNumber = ProcessNumberService.toString(numbersSatisfy);
        ProcessNumberService.showString(stringNumber);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

}