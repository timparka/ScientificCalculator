package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

import org.codehaus.plexus.util.cli.Commandline;

public class ScientificFeatures {
    String display = "default";
    String mode = "radians";
    double result;
    double num1;
    double num2;
    String operator;
    double mem = 0;
    Scanner sc = new Scanner(System.in);

    public ScientificFeatures(){

    }
    //this method should get current display and switch to next default mode
    public void switchDisplayMode() {
        if (display.equals("default")) {
            display = "binary";
        } else if (display.equals("binary")) {
            display = "octal";
        } else if (display.equals("octal")) {
            display = "decimal";
        } else if (display.equals("decimal")) {
            display = "hexadecimal";
        } else if (display.equals("hexadecimal"))
            display = "default";
    }

    //method provides a way to switch displays manually
    public void switchDisplayMode(String display) {
        if (!display.equals("default") || !display.equals("binary")
                || !display.equals("octal")
                || !display.equals("decimal")
                || !display.equals("hexadecimal")) {
            throw new IllegalArgumentException("Enter correct value.");
        } else {
            this.display = display;
        }
    }

    //method provides a way to do something with display value based on user input
    public double storeValue(String memKey, double currentlyOnDisplay) {
        if (memKey.equals("M+")) {
            mem = currentlyOnDisplay;
        } else if (memKey.equals("MC")) {
            mem = 0;
        } else if (memKey.equals("MRC")) {
            return mem;
        }

        return mem;
    }

    public void sin() {
        System.out.println("Please enter the number you want to sine: ");
        num1 = sc.nextInt();
                result = Math.sin(num1);
    }
    public void cos() {
        System.out.println("Please enter the number you want to cos: ");
        num1 = sc.nextInt();
        result = Math.cos(num1);
    }
    public void tan() {
        System.out.println("Please enter the number you want to tan: ");
        num1 = sc.nextInt();
        result = Math.tan(num1);
    }
    public void invSin() {
        System.out.println("Please enter the number you want to inverse sin: ");
        num1 = sc.nextInt();
        result = Math.asin(num1);
    }
    public void invCos() {
        System.out.println("Please enter the number you want to inverse cos: ");
        num1 = sc.nextInt();
        result = Math.acos(num1);
    }
    public void invTan() {
        System.out.println("Please enter the number you want to inverse tan: ");
        num1 = sc.nextInt();
        result = Math.atan(num1);
    }

    public void switchUnitsMode() {
        if (mode.equals("degrees")) {
            mode = "radians";
        } else if (mode.equals("radians")) {
            mode = "degrees";
        }
    }

    public void switchUnitsMode(String mode) {
            if (!mode.equals("degrees") || !display.equals("radians")) {
                throw new IllegalArgumentException("Enter correct value.");
            } else {
                this.mode = mode;
            }
        }

    public void log() {
        System.out.println("Please enter number to log");
            num1 = sc.nextInt();
            result = Math.log10(num1);
        }

    public void invLog() {
        System.out.println("Please enter number to log");
        num1 = sc.nextInt();
        //result = Math.(num1);
    }

    public void logE() {
        System.out.println("Please enter number to log by natural");
        num1 = sc.nextInt();
        result = Math.log(num1);
    }

    public void invLogE() {
        System.out.println("Please enter number to log");
        num1 = sc.nextInt();
        result = Math.log10(num1);
    }


    public void factorialFunc() {
        System.out.println("Please enter number for factorial of number");
        num1 = sc.nextInt();
        for (int i = 0; i <= num1; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    public void run() {


        System.out.println("please pick a function");

        if (operator == "cycle"){
            this.switchDisplayMode();
        } else if (operator == "choose display mode") {
            this.switchDisplayMode();
        } else if (operator == "") {
            
        }
    }
}
