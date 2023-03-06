package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

import static com.zipcodewilmington.scientificcalculator.MainApplication.isNumeric;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    static String menu = "\nChoose an operation:\n+ Add\n- Subtract\n* Multiply\n/ Divide\n^ Exponent\n~ Square Root\n1/x Inverse\n-1 switchSign\n Exit";

    public double run(String userInput, double display) {
        String yValueInput = "";
        double yValue = 0;
        double result = 0;
        if (userInput.equals("+")) {
            System.out.println("Enter second number: ");
            yValueInput = scanner.nextLine();
            if (isNumeric(yValueInput)) { //checks if its a number
                yValue = Double.parseDouble(yValueInput);//parses string as double
                result = display + yValue;//this is logic line
                return result; //result of x + y and returns it calc.run();
            }
        } else if (userInput.equals ("-")) {
            System.out.println("Enter second number: ");
            yValueInput = scanner.nextLine();
            if (isNumeric(yValueInput)) { //checks if its a number
                yValue = Double.parseDouble(yValueInput);//parses string as double
                result = display - yValue;//this is logic line
                return result; //result of x - y and returns it calc.run();
            }
        } else if (userInput.equals ("*") {
            System.out.println("Enter second number: ");
            yValueInput = scanner.nextLine();
            if (isNumeric(yValueInput)) { //checks if its a number
                yValue = Double.parseDouble(yValueInput);//parses string as double
                result = display * yValue;//this is logic line
                return result; //result of x * y and returns it calc.run();//
            }
        } else if (userInput.equals ("/") {
            System.out.println("Enter second number: ");
            yValueInput = scanner.nextLine();
            if (isNumeric(yValueInput)) { //checks if its a number
                yValue = Double.parseDouble(yValueInput);//parses string as double
                result = display / yValue;//this is logic line
                return result; //result of x / y and returns it calc.run();//
            }
        } else if (userInput.equals("sq")) {
            result = display * display;//logic line
            return result; //return line
        } else if (userInput.equals("sqrt")) {
            result = Math.sqrt(display);//logic line
            return result;
        } else if (userInput.equals("x^y")) {
            result = Math.pow(display, yValue) ;//logic line
            return result; //return line
        } else if (userInput.equals("1/x")) {
            result = 1 / display;//logic line
            return result;
        } else if (userInput.equals("-x")) {
            result = -1 * display;//logic line
            return result; //return line
        }
        return display;//checks if user inputs out of bounds input then method spits out original number input from beginning
    }
}




