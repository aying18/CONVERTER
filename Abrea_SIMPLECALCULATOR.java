/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abrea_simple.calculator;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Abrea_SIMPLECALCULATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Operator");
        System.out.println("Press 1 to Add ");
        System.out.println("Press 2 to Subtract");
        System.out.println("Press 3 to Divide");
        System.out.println("Press 4 to Multiply");
        double a = 0;
        double b = 0;
        double r = 0;
      	double c = 0;
        c = input.nextInt();
        System.out.println("Enter the First Value");
        a = input.nextInt();
        System.out.println("Enter the Second Value");
        b = input.nextInt();
        if (c == 1) {
            r = a + b;
            System.out.println("The Sum:" + r);
        } else if (c == 2) {
            r = a - b;
            System.out.println("The Difference:" + r);
        } else if (c == 3) {
            r = a / b;
            System.out.println("The Quotient:" + r);
        } else if (c == 4) {
            r = a * b;
            System.out.println("The Multiple:" + r);
        }else{
            System.out.println("Cannot Perform");
        } System.out.println("Thank You");
    }
        // TODO code application logic here
    }
    
}
