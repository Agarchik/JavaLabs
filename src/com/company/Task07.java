package com.company;

public class Task07 {

    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        double fahrenheuit = (9 / 5.0) * celsius  + 32;
        return fahrenheuit;

    }
}
