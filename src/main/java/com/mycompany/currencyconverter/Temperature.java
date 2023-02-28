/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.currencyconverter;

/**
 *
 * @author alan
 */
public class Temperature {

    public static double celsiusToFahrenheit(double value) {
        return (value * 1.8) + 32;
    }

    public static double fahrenheitToCelsius(double value) {
        return (value - 32) / 1.8;
    }

    public static double kelvinToCelsius(double value) {
        return value - 273.15;
    }

    public static double celsiusToKelvin(double value) {
        return value + 273.15;
    }

    public static double fahrenheitToKelvin(double value) {
        return (5 * (value - 32) / 9 + 273.15);
    }

    public static double kelvinToFahrenheit(double value) {
        return 1.8 * (value - 273.15) + 32;
    }

}
