package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

import org.codehaus.plexus.util.cli.Commandline;

public class ScientificFeatures {
    String scientificDisplay = "decimal";
    String modeU = "degrees";
    double result;
    Scanner sc = new Scanner(System.in);

    public ScientificFeatures() {

    }

    //this method should get current display and switch to next default mode
    public void switchDisplayMode(double display) {
        if (scientificDisplay.equals("decimal")) {
            scientificDisplay = "binary";
        } else if (scientificDisplay.equals("binary")) {
            scientificDisplay = "hex";
        } else if (scientificDisplay.equals("hex")) {
            scientificDisplay = "octal";
        } else if (scientificDisplay.equals("octal")) {
            scientificDisplay = "decimal";
        }
    }

    //method provides a way to switch displays manually
    public void switchDisplayMode(String display) {
        if (!display.equals("hex") && !display.equals("binary")
                && !display.equals("octal")
                && !display.equals("decimal")) {
            throw new IllegalArgumentException("Enter correct value.");
        } else {
            this.scientificDisplay = display;
        }
    }

    public void switchUnitsMode(double display) {
        if (modeU.equals("degrees")) {
            modeU = "radians";
        } else if (modeU.equals("radians")) {
            modeU = "degrees";
        }
    }
    //method to switch modes manually and exits program if user enters invalid response
    public void switchUnitsMode(String userInput) {
        if (!userInput.equals("degrees") && !userInput.equals("radians")) {
            throw new IllegalArgumentException("Enter correct value.");
        } else {
            this.modeU = userInput;
        }
    }
    //gets user input and spits out sin value
    public double sin(double display) {
        result = Math.sin(display);
        return result;
    }

    //gets user input and spits out cos value
    public double cos(double display) {
        result = Math.cos(display);
        return result;
    }

    //gets user input and spits out tan value
    public double tan(double display) {
        result = Math.tan(display);
        return result;
    }

    //gets user input and spits out inverse sin value
    public double invSin(double display) {
        result = Math.asin(display);
        return Math.toRadians(result);
    }

    //gets user input and spits out inverse cos value
    public double invCos(double display) {
        result = Math.acos(display);
        return Math.toRadians(result);
    }

    //gets user input and spits out inverse tan value
    public double invTan(double display) {
        result = Math.atan(display);
        return Math.toRadians(result);
    }

    //switches units from degrees to radians



    //gets user input and uses log base 10 function on number
    public double log(double display) {
        result = Math.log10(display);
        return result;
    }

    //gets user input and uses ln on number
    public double invLn(double display) {
        result = Math.exp(display);
        return result;
    }

    //gets user input and
    public double ln(double display) {
        result = Math.log(display);
        return result;
    }

    public double invLog(double display) {
        result = Math.pow(10, display);
        return result;
    }


    public double factorialFunc(double display) {
        double fact = 1;
        for (int i = 1; i <= display; i++) {
            fact *= i;
            result = fact;
        }
        return result;
    }

    public double run(String userInput, double display) {
        if (userInput.equals("binary")) {
            this.switchDisplayMode(display);
            return display;
        } else if (userInput.equals("hex")) {
            this.switchDisplayMode(display);
            return display;
        }  else if (userInput.equals("octal")) {
            this.switchDisplayMode(display);
            return display;
        } else if (userInput.equals("decimal")) {
            this.switchDisplayMode(display);
            return display;
        } else if (userInput.equals("dmode")) {
            System.out.println("Please choose display mode: ");
            scientificDisplay = sc.nextLine();
            this.switchDisplayMode(scientificDisplay);
            return display;
        } else if (userInput.equals("radians")) {
            this.switchUnitsMode(display);
            return display;
        } else if (userInput.equals("umode")) {
            System.out.println("Please choose display mode: ");
            modeU = sc.nextLine();
            this.switchUnitsMode(modeU);
            return display;
        } else if (userInput.equals("sin")) {
            this.sin(display);
            return result;
        } else if (userInput.equals("cos")) {
            this.cos(display);
            return result;
        } else if (userInput.equals("tan")) {
            this.tan(display);
            return result;
        } else if (userInput.equals("invsin")) {
            this.invSin(display);
            return result;
        } else if (userInput.equals("invcos")) {
            this.invCos(display);
            return result;
        } else if (userInput.equals("invtan")) {
            this.invTan(display);
            return result;
        } else if (userInput.equals("log")) {
            this.log(display);
            return result;
        } else if (userInput.equals("invlog")) {
            this.invLog(display);
            return result;
        } else if (userInput.equals("ln")) {
            this.ln(display);
            return result;
        } else if (userInput.equals("invln")) {
            this.invLn(display);
            return result;
        } else if (userInput.equals("factorial")) {
            this.factorialFunc(display);
            return result;
        } else if (userInput.equals("radians")) {
            this.switchUnitsMode(userInput);
        } else if (userInput.equals("degrees")) {
            this.switchUnitsMode(userInput);
        } else if (userInput.equals("log")) {
            this.log(display);
        } else if (userInput.equals("invlog")) {
            this.invLog(display);
        } else if (userInput.equals("ln")) {
            this.ln(display);
        } else if (userInput.equals("invln")) {
            this.invLn(display);
        }
        return display;
    }
}
