/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.currencyconverter;

/**
 *
 * @author alan
 */
public class Currency {
    protected double value; // importe 
	
	public Currency(double value) {
		this.value = value;
		
	}

	public double toPesos(double amount) { // moneda a pesos
		return amount * value;
	}
	public double fromPesos(double amount) { // pesos a moneda 
		return amount /  value;
	}
}
