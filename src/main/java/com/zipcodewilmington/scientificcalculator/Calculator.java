package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

import static com.zipcodewilmington.scientificcalculator.MainApplication.isNumeric;

public class Calculator {
    char operator;
    Scanner scanner = new Scanner(System.in);
    static String menu = "\nChoose an operation:\n+ Add\n- Subtract\n* Multiply\n/ Divide\n^ Exponent\n~ Square Root\n1/x Inverse\n-1 switchSign\n Exit";

    public double run(String userInput, double display) {
        String yValueInput = "";
        double yValue = 0;
        double result = 0;
        if (userInput.equals("+")) {
            System.out.println("Enter second number: ");
            yValueInput = scanner.nextLine();
            if (isNumeric(yValueInput)) {
                yValue = Double.parseDouble(yValueInput);
                result = display + yValue;
                return result; //result of x + y and returns it calc.run();
            }
        }
        return display;//checks if user inputs out of bounds input then method spits out original number input from beginning
    }
}




