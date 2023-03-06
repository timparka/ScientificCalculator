package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

import static com.zipcodewilmington.scientificcalculator.MainApplication.isNumeric;


import java.util.Scanner;
public class Calculator {

    static Calculator calculator = new Calculator();
    //char operator;
    static Scanner scanner = new Scanner(System.in);
    static String menu = "\nChoose an operation:\n+ Add\n- Subtract\n* Multiply\n/ Divide\n^ Exponent\n~ Square Root\n1/x Inverse\n-1 switchSign\n Exit";

    public static void main(String[] args) {

        calculator.run("+");
    }
    public void run(String userInput) {
        display(userInput);

        if (userInput.equals("+")) {
            int y = getYInput();
            int x = getXInput();
            add(y, x);
        } else if (userInput.equals("-")) {
            int y = getYInput();
            int x = getXInput();
            subtract(y, x);
        } else if (userInput.equals("*")) {
            int y = getYInput();
            int x = getXInput();
            multiply(y, x);
        } else if (userInput.equals("/")) {
            int y = getYInput();
            int x = getXInput();
            divide(y, x);
        }
    }

    public void add(int int1, int int2) {
        System.out.println(int1 + int2);
    }

    public void subtract(int int1, int int2) {
        System.out.println(int1 - int2);
    }

    public void multiply(int int1, int int2) {
        System.out.println(int1 * int2);
    }
    public void divide(int int1, int int2) {
        System.out.println(int1 / int2);
    }

    public int getYInput() {
        System.out.println("Enter the first number: ");
        String yValueInput = scanner.nextLine();
        display(yValueInput);
        int yValueInt = Integer.parseInt(yValueInput);
        return yValueInt;
    }
    public int getXInput() {
        System.out.println("Enter the second number: ");
        String xValueInput = scanner.nextLine();
        display(xValueInput);
        int xValueInt = Integer.parseInt(xValueInput);
        return xValueInt;
    }

    public void display(String lastInput) {
        System.out.println(lastInput);
    }
}





//        String yValueInput = "";
//        double yValue = 0;
//        double result = 0;
//        if (userInput.equals("+")) {
//            System.out.println("Enter second number: ");
//            yValueInput = scanner.nextLine();
//            if (isNumeric(yValueInput)) {
//                yValue = Double.parseDouble(yValueInput);
//                result = display + yValue;
//                return result; //result of x + y and returns it calc.run();
//            }
//        }
//        return display;//checks if user inputs out of bounds input then method spits out original number input from beginning




