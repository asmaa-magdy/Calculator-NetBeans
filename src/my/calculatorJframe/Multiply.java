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
public class Multiply extends Operations{
    /**
     * override to the parent class
     * to multiply 2 numbers
     * @param firstNumber
     * @param secondNumber
     * @return the multiplied value
     */
    public String getValueOf(double firstNumber, double secondNumber){
        double newValue = firstNumber * secondNumber;
        Calculator.result = newValue;
        String mulValue = String.valueOf(newValue);
        return mulValue;
    }
}
