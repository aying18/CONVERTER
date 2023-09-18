/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abreatemp;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ABREAtemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Select Converter");
        System.out.println("Press 1 to Celsius to Fahrenheit");
        System.out.println("Press 2 to Fahrenheit to Celsius");
        System.out.println("Press 3 to Kelvin to Fahrenheit");
        System.out.println("Press 4 to Kelvin to Celsius");
        System.out.println("Press 5 to Celsius to Kelvin");
        System.out.println("Press 6 to Fahrenheit to Kelvin");
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double e = 0;
        double f = 0;
        double h = 0;
        double g = 0;

        c = input.nextInt();
        System.out.println("Enter the Temperature");
        a = input.nextInt();
        if (c == 1) {
            b = (a *9 / 5) + 32;
            System.out.println("The value is:" + b);
        } else if (c == 2) {
            d = ( a - 32) * 5 / 9;
            System.out.println("The value is:" + d);
        } else if (c == 3) {
            g =  (a - 273.15) *(9/5)+ 32;
            System.out.println("The value is:" + g);
        } else if (c == 4) {
            h = a - 273.15;
            System.out.println("The value is:" + h);
        } else if (c == 5) {
            e = a + 273.15;
            System.out.println("The value is:" + e);
        } else if (c == 6) {
            f = ((32 * a) - 32) * (5 / 9) + (273.15);
            System.out.println("The value is:" + f);
        }else{
            System.out.println("Cannot Perform");
        }
    }
    // TODO code application logic here
}
