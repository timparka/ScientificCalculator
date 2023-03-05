package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Calculator {
        int num1 = 0;
        int num2 = 0;
        int tempNum = 0;
        char operator;
        double answer = 0.0;
        Scanner scanner = new Scanner(System.in);


    public void run() {
            System.out.println("Enter a number: ");
            num1 = scanner.nextInt();

            System.out.print("Enter a second number: ");
            num2 = scanner.nextInt();

            System.out.println("Enter an operator: ");
            operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;
            }
        }
    }
