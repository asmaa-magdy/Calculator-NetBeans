/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.calculatorJframe;

import javax.swing.JTextField;

/**
 *
 * @author mo2a
 */
public class PlusMinus {
    /**
     * this function with one parameter to change its state from positive to negative and the opposite 
     * @param result negative or positive of number in textField 
     * @return 
     */
    public String getValueOf(String result){
        double newResult = (Double.parseDouble(result));
        System.out.println("is here");
        newResult *= -1;
        String newValue = String.valueOf(newResult);
        return newValue;
    }
}
