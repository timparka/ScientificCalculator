package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please choose which calculator you would like to use: ");
            String userInput = sc.nextLine();
            //need while loop for program to store memory and run continuously
            if (userInput.equals("calculator")) {
                new Calculator().run();
            } else if (userInput.equals("scientific")) {
                new ScientificFeatures().run();
            } else {
                System.out.println("Enter proper Calculator name.");
            }


    }
}
