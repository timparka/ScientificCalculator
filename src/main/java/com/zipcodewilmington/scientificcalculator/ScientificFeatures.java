package com.zipcodewilmington.scientificcalculator;

import org.codehaus.plexus.util.cli.Commandline;

public class ScientificFeatures {
    String display = "default";

    double mem = 0;

    public void switchDisplayMode() {
        //this method should get current display and switch to next default mode
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

    public void logarithmicFunc() {

    }

    public void factorialFunc() {

    }
}
