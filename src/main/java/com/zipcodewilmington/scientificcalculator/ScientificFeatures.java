//package com.zipcodewilmington.scientificcalculator;
//import java.util.Scanner;
//
//import org.codehaus.plexus.util.cli.Commandline;
//
//public class ScientificFeatures {
//    String scientificDisplay = "";
//    String mode = "radians";
//    double result;
//    double mem = 0;
//    Scanner sc = new Scanner(System.in);
//
//    public ScientificFeatures(){
//
//    }
//    //this method should get current display and switch to next default mode
//    public void switchDisplayMode() {
//        if (scientificDisplay.equals("default")) {
//            scientificDisplay = "binary";
//        } else if (scientificDisplay.equals("binary")) {
//            scientificDisplay = "octal";
//        } else if (scientificDisplay.equals("octal")) {
//            scientificDisplay = "decimal";
//        } else if (scientificDisplay.equals("decimal")) {
//            scientificDisplay = "hexadecimal";
//        } else if (scientificDisplay.equals("hexadecimal"))
//            scientificDisplay = "default";
//    }
//
//    //method provides a way to switch displays manually
//    public void switchDisplayMode(String display) {
//        if (!display.equals("default") && !display.equals("binary")
//                && !display.equals("octal")
//                && !display.equals("decimal")
//                && !display.equals("hexadecimal")) {
//            throw new IllegalArgumentException("Enter correct value.");
//        } else {
//            this.scientificDisplay = display;
//        }
//    }
//
//    //method provides a way to do something with display value based on user input
//    public double storeValue(String memKey, double currentlyOnDisplay) {
//        if (memKey.equals("M+")) {
//            mem = currentlyOnDisplay;
//        } else if (memKey.equals("MC")) {
//            mem = 0;
//        } else if (memKey.equals("MRC")) {
//            return mem;
//        }
//
//        return mem;
//    }
//
//    //gets user input and spits out sin value
//    public double sin(double display) {
//        result = Math.sin(display);
//        return result;
//    }
//
//    //gets user input and spits out cos value
//    public double cos(double display) {
//        result = Math.cos(display);
//        return result;
//    }
//
//    //gets user input and spits out tan value
//    public double tan(double display) {
//        result = Math.tan(display);
//        return result;
//    }
//
//    //gets user input and spits out inverse sin value
//    public double invSin(double display) {
//        result = Math.asin(display);
//        return result;
//    }
//
//    //gets user input and spits out inverse cos value
//    public double invCos(double display) {
//        result = Math.acos(display);
//        return result;
//    }
//
//    //gets user input and spits out inverse tan value
//    public double invTan(double display) {
//        result = Math.atan(display);
//        return result;
//    }
//
//    //switches units from degrees to radians
//    public void switchUnitsMode() {
//        if (mode.equals("degrees")) {
//            mode = "radians";
//        } else if (mode.equals("radians")) {
//            mode = "degrees";
//        }
//    }
//
//    //method to switch modes manually and exits program if user enters invalid response
//    public void switchUnitsMode(String mode) {
//            if (!mode.equals("degrees") && !mode.equals("radians")) {
//                throw new IllegalArgumentException("Enter correct value.");
//            } else {
//                this.mode = mode;
//            }
//        }
//
//
//        //gets user input and uses log base 10 function on number
//        public double log(double display) {
//            result = Math.log10(display);
//            return result;
//        }
//
//        //gets user input and uses ln on number
//        public double invLog(double display) {
//            //result = Math.(display);
//            return result;
//        }
//
//    //gets user input and
//    public double ln(double display) {
//        result = Math.log(display);
//        return result;
//    }
//
//    public double invLn(double display) {
//      //  result = Math.(display);
//        return result;
//    }
//
//
//    public double factorialFunc(double display) {
//        for (int i = 0; i <= display; i++) {
//            result *= i;
//        }
//        return result;
//    }
//
//    public double run(String userInput, double display) {
//        if (userInput.equals("cycled")) {
//            this.switchDisplayMode();
//            return display;
//        }
//
////        else if (userInput.equals("dmode")) {
////            System.out.println("Please choose display mode: ");
////            userInput = sc.nextLine();
////            this.switchDisplayMode(display);
////            return true;
////        } else if (display.equals("cycleu")) {
////            this.switchUnitsMode();
////            return true;
////        }else if (display.equals("umode")) {
////            System.out.println("Please choose display mode: ");
////            mode = sc.nextLine();
////            this.switchUnitsMode(mode);
////            return true;
////        } else if (userInput.equals("sin")) {
////            this.sin(Double.parseDouble(display));
////        } else if (display.equals("cos")) {
////            this.cos(Double.parseDouble(display));
////        } else if (display.equals("tan")) {
////            this.tan(Double.parseDouble(display));
////        } else if (display.equals("invsin")) {
////            this.invSin(Double.parseDouble(display));
////        } else if (display.equals("invcos")) {
////            this.invCos(Double.parseDouble(display));
////        } else if (display.equals("invtan")) {
////            this.invTan(Double.parseDouble(display));
////        }
//        return display;
//    }
//}
