package org.example;

import java.io.*;

public class CounterApp implements Serializable {
    private int counter;
    String fileName = "counter.txt";

    public CounterApp() {
        this.counter = 0;
    }

    public void incrementCounter() {
        this.counter++;
    }

    public void resetCounter() {
        this.counter = 0;
    }

    public void printCounter() {
        System.out.println("Текущее значение счетчика равно: " + this.counter);
    }

    public void printCounterEnd() {
        System.out.println("Завершаю работу");
    }

    //запись переменной counter  в filename
    public void writeVariableToFile(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(String.valueOf(counter));
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    //чтение файла построчно с именем filename
    public void readVariableToFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Счетчик загружен, текущее значение: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // проверяется размер файла, если размер не равен нулю, то выполняется код внутри условия
    public void checkFile() {
        File file = new File("counter.txt");
        if (file.length() != 0) {
            readVariableToFile("counter.txt");
        } else {
            System.out.println("Текущее знчение: 0");
        }

    }
}