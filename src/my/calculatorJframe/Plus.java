/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.calculatorJframe;

/**
 *
 * @author mo2a
 */
public class Plus extends Operations{
    /**
     * override for parent's function 
     * to add two numbers
     * @param firstNumber
     * @param secondNumber
     * @return the added value
     */
 public String getValueOf(double firstNumber, double secondNumber){
     double newValue = firstNumber + secondNumber;
     Calculator.result = newValue;
     String addedValue = String.valueOf(newValue);
     return addedValue;
 }
}
