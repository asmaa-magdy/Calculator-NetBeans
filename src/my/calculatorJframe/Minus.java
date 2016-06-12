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
public class Minus extends Operations{
    /**
     * override to the parent function 
     * to abstract two values
     * @param firstNumber
     * @param secondNumber
     * @return the abstracted value
     */
    public String getValueOf(double firstNumber, double secondNumber){
        double newValue = firstNumber - secondNumber;
        Calculator.result = newValue;
        String abstractedValue = String.valueOf(newValue);
        return abstractedValue;
    }
}
