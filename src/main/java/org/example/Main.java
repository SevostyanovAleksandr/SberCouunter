package org.example;


public class Main {

    //метод является точкой входа программы
    public static void main(String[] args) {
        CounterApp counterApp = new CounterApp();
        CounterLogic counterLogic = new CounterLogic();
        counterApp.checkFile();
        counterLogic.setCounterLogic();
        counterApp.printCounterEnd();
    }
}
