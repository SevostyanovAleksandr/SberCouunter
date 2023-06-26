package org.example;

import java.util.Scanner;

public class CounterLogic {
    CounterApp counterApp = new CounterApp();
    Scanner scanner = new Scanner(System.in);
    String inputScanner;

    // представляет собой метод, который содержит логику работы счетчика
    public void setCounterLogic() {
        do {
            System.out.print("\nВведите команду: ");
            inputScanner = scanner.nextLine();
            if (inputScanner.equalsIgnoreCase("/inc")) {
                counterApp.incrementCounter();
                counterApp.printCounter();
            } else if (inputScanner.equalsIgnoreCase("/reset")) {
                counterApp.resetCounter();
                counterApp.printCounter();
            } else if (!inputScanner.equalsIgnoreCase("/stop")) {
                System.out.println("Неверная команда, попробуйте еще раз.");
            }
        } while (!inputScanner.equalsIgnoreCase("/stop"));
        counterApp.printCounter();
        counterApp.writeVariableToFile("counter.txt");
    }
}