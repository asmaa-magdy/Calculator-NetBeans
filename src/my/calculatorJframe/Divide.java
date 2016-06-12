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
public class Divide extends Operations{
    /**
     * override the parent function
     * to divide two numbers
     * @param firstNumber
     * @param secondNumber
     * @return the divided result
     */
    public String getValueOf(double firstNumber, double secondNumber){
        double newValue = firstNumber / secondNumber;
        Calculator.result = newValue;
        String divValue = String.valueOf(newValue);
        return divValue;
    }
}
