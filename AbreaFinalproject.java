/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abreafinalproject;


import java.util.Scanner;
import java.util.function.Function;


/**
 *
 * @author St. Michael
 */
public class AbreaFinalproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        // Get user input for the coefficients
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        System.out.print("Enter the coefficient d: ");
        double d = scanner.nextDouble();

        // Get user input for initial guesses
        System.out.print("Enter the first initial guess (x0): ");
        double x0 = scanner.nextDouble();

        System.out.print("Enter the second initial guess (x1): ");
        double x1 = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Solve the user-defined 3rd order equation using the secant method
        solve3rdOrderEquation(a, b, c, d, x0, x1);
    }

    private static void solve3rdOrderEquation(double a, double b, double c, double d, double x0, double x1) {
        // Set the function for the 3rd order equation: ax^3 + bx^2 + cx + d
        Function<Double, Double> equation = x -> a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d;

        // Set the tolerance for the solution
        double tolerance = 1e-8;

        // Set the maximum number of iterations
        int maxIterations = 1000;

        // Perform the secant method iterations
        int iterations = 0;
        double x2;
        do {
            // Calculate the next approximation using the secant method formula
            double f0 = equation.apply(x0);
            double f1 = equation.apply(x1);
            x2 = x1 - f1 * (x1 - x0) / (f1 - f0);

            // Update values for the next iteration
            x0 = x1;
            x1 = x2;

            // Increment the iteration counter
            iterations++;

            // Check for convergence
            if (Math.abs(equation.apply(x2)) < tolerance) {
                System.out.println("Root found: x = " + x2);
                System.out.println("Number of iterations: " + iterations);
                return;
            }
        } while (iterations < maxIterations);

        // If the method does not converge within the specified iterations
        System.out.println("Secant method did not converge within the specified iterations.");
    }
}