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
        if (!display.equals("default") && !display.equals("binary")
                && !display.equals("octal")
                && !display.equals("decimal")
                && !display.equals("hexadecimal")) {
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

    //gets user input and spits out sin value
    public void sin() {
        System.out.println("Please enter the number you want to sine: ");
        num1 = sc.nextInt();
        result = Math.sin(num1);
        System.out.println(result);
    }

    //gets user input and spits out cos value
    public void cos() {
        System.out.println("Please enter the number you want to cos: ");
        num1 = sc.nextInt();
        result = Math.cos(num1);
    }

    //gets user input and spits out tan value
    public void tan() {
        System.out.println("Please enter the number you want to tan: ");
        num1 = sc.nextInt();
        result = Math.tan(num1);
    }

    //gets user input and spits out inverse sin value
    public void invSin() {
        System.out.println("Please enter the number you want to inverse sin: ");
        num1 = sc.nextInt();
        result = Math.asin(num1);
    }

    //gets user input and spits out inverse cos value
    public void invCos() {
        System.out.println("Please enter the number you want to inverse cos: ");
        num1 = sc.nextInt();
        result = Math.acos(num1);
    }

    //gets user input and spits out inverse tan value
    public void invTan() {
        System.out.println("Please enter the number you want to inverse tan: ");
        num1 = sc.nextInt();
        result = Math.atan(num1);
    }

    //switches units from degrees to radians
    public void switchUnitsMode() {
        if (mode.equals("degrees")) {
            mode = "radians";
        } else if (mode.equals("radians")) {
            mode = "degrees";
        }
    }

    //method to switch modes manually and exits program if user enters invalid response
    public void switchUnitsMode(String mode) {
            if (!mode.equals("degrees") && !display.equals("radians")) {
                throw new IllegalArgumentException("Enter correct value.");
            } else {
                this.mode = mode;
            }
        }


        //gets user input and uses log base 10 function on number
    public void log() {
        System.out.println("Please enter number to log");
            num1 = sc.nextInt();
            result = Math.log10(num1);
        }

        //gets user input and uses ln on number
    public void invLog() {
        System.out.println("Please enter number to log");
        num1 = sc.nextInt();
        //result = Math.(num1);
    }

    //gets user input and
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


        System.out.println("please pick a function: ");
        operator = sc.nextLine();
        if (operator.equals("cycled")) {
            this.switchDisplayMode();
        } else if (operator.equals("dmode")) {
            System.out.println("Please choose display mode: ");
            display = sc.nextLine();
            this.switchDisplayMode(display);
        } else if (operator.equals("cycleu")) {
            this.switchUnitsMode();
        }else if (operator.equals("umode")) {
            System.out.println("Please choose display mode: ");
            mode = sc.nextLine();
            this.switchUnitsMode(mode);
        } else if (operator.equals("sin")) {
            this.sin();
        } else if (operator.equals("cos")) {
            this.cos();
        } else if (operator.equals("tan")) {
            this.tan();
        } else if (operator.equals("invsin")) {
            this.invSin();
        } else if (operator.equals("invcos")) {
            this.invCos();
        } else if (operator.equals("invtan")) {
            this.invTan();
        }
    }
}
