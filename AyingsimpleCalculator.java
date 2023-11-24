/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ayingsimplecalculator;

import java.util.Scanner;

/**
 *
 * @author St. Michael
 */
public class AyingsimpleCalculator {

    public static boolean main(String[] args) {
        try ( Scanner scanner = new Scanner(System.in)) {
            System.out.println("WELCOME TO AYING PROGRAM");
            System.out.println("CHOOSE AN OPTION");
            System.out.println("Press 1 to Trigonometric Calculation(sin, cos , tan)");
            System.out.println("Press 2 SolidMensurationProblem ");
            System.out.println("Press 3 to Poliygon Surface Area Calculator");
            System.out.println("Press 4 to Temperature Converter");
            int c = scanner.nextInt();
            double volume;
            double radius;
            double height;

            switch (c) {
                case 1:
                    while (true) {
                        System.out.println("Choose an operation:");
                        System.out.println("1. Calculate sine");
                        System.out.println("2. Calculate cosine");
                        System.out.println("3. Calculate tangent");
                        System.out.print("Enter your choice (1/2/3): ");

                        int ch = scanner.nextInt();

                        System.out.print("Enter an angle in degrees: ");
                        double angleDegrees = scanner.nextDouble();

                        double angleRadians = Math.toRadians(angleDegrees);

                        switch (ch) {
                            case 1 -> {
                                double sine = Math.sin(angleRadians);
                                System.out.println("Sine(" + angleDegrees + " degrees) = " + sine);
                            }
                            case 2 -> {
                                double cosine = Math.cos(angleRadians);
                                System.out.println("Cosine(" + angleDegrees + " degrees) = " + cosine);
                            }
                            case 3 -> {
                                double tangent = Math.tan(angleRadians);
                                System.out.println("Tangent(" + angleDegrees + " degrees) = " + tangent);
                            }
                            default ->
                                System.out.println("Invalid choice.");
                        }
                        System.out.print("Do you want to continue? (y/n): ");
                        String response = scanner.next().toLowerCase();

                        if (response.equals("y")) {
                            continue;

                        } else {
                            System.out.println("Thank you for using the Solid Mensuration Problem Solver. Goodbye!");
                        }
                        break;
                    }

                case 2:
                    while (true) {
                        System.out.println("Solid Mensuration Problem Solver Menu:");
                        System.out.println("1. Calculate Cuboid Volume");
                        System.out.println("2. Calculate Sphere Volume");
                        System.out.println("3. Calculate Cylinder Volume");
                        System.out.print("Enter your choice: (1-3)");
                        int choi = scanner.nextInt();

                        switch (choi) {
                            case 1:
                                System.out.print("Enter length of the cuboid: ");
                                double length = scanner.nextDouble();
                                System.out.print("Enter width of the cuboid: ");
                                double width = scanner.nextDouble();
                                System.out.print("Enter height of the cuboid: ");
                                height = scanner.nextDouble();

                                volume = length * width * height;
                                System.out.println("The volume of the cuboid is: " + volume);
                            case 2:
                                System.out.print("Enter the radius of the sphere: ");
                                radius = scanner.nextDouble();

                                volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
                                System.out.println("The volume of the sphere is: " + volume);
                            case 3:
                                System.out.print("Enter the radius of the cylinder: ");
                                radius = scanner.nextDouble();
                                System.out.print("Enter the height of the cylinder: ");
                                height = scanner.nextDouble();

                                volume = Math.PI * Math.pow(radius, 2) * height;
                                System.out.println("The volume of the cylinder is: " + volume);
                        }
                        System.out.print("Do you want to continue? (y/n): ");
                        String response = scanner.next().toLowerCase();

                        if (response.equals("y")) {
                            continue;
                        } else {
                            System.out.println("Thank you for using the Solid Mensuration Problem Solver. Goodbye!");
                        }
                        break;
                    }

                case 3:
                    while (true) {
                        System.out.println("Choose a shape to calculate surface area:");
                        System.out.println("1. Rectangle");
                        System.out.println("2. Triangle");
                        System.out.println("3. Circle");
                        System.out.println("4. Square");
                        System.out.print("Enter your choice (1/2/3/4): ");
                        int cho = scanner.nextInt();

                        switch (cho) {
                            case 1 -> {
                                System.out.print("Enter the length of the rectangle: ");
                                double length = scanner.nextDouble();
                                System.out.print("Enter the width of the rectangle: ");
                                double width = scanner.nextDouble();
                                double surfaceArea = length * width;
                                System.out.println("Surface Area of Rectangle: " + surfaceArea);
                            }
                            case 2 -> {
                                System.out.print("Enter the base of the triangle: ");
                                double base = scanner.nextDouble();
                                System.out.print("Enter the height of the triangle: ");
                                height = scanner.nextDouble();
                                double surface = 0.5 * base * height;
                                System.out.println("Surface Area of Triangle: " + surface);
                            }
                            case 3 -> {
                                System.out.print("Enter the radius of the circle: ");
                                radius = scanner.nextDouble();
                                double surfaceA = Math.PI * Math.pow(radius, 2);
                                System.out.println("Surface Area of Circle: " + surfaceA);
                            }
                            case 4 -> {
                                System.out.print("Enter the side length of the square: ");
                                double sideLength = scanner.nextDouble();
                                double surfaceAr = Math.pow(sideLength, 2);
                                System.out.println("Surface Area of Square: " + surfaceAr);
                            }
                            default ->
                                System.out.println("Invalid choice.");
                        }
                        System.out.print("Do you want to continue? (y/n): ");
                        String response = scanner.next().toLowerCase();

                        if (response.equals("y")) {
                            continue;
                        } else {
                            System.out.println("Thank you for using the Solid Mensuration Problem Solver. Goodbye!");
                        }
                        break;
                    }
                case 4:

                    System.out.println("Temperature Converter");
                    System.out.println("1. Celsius to Fahrenheit");
                    System.out.println("2. Fahrenheit to Celsius");
                    System.out.println("3. Kelvin to Fahrenheit");
                    System.out.println("4. Kelvin to Celsius");
                    System.out.println("5. Celsius to Kelvin");
                    System.out.println("6. Fahrenheit to Kelvin");
                    System.out.print("Enter your choice (1-6): ");

                    int choice = scanner.nextInt();

                    double inputTemperature = 0,
                     convertedTemperature = 0;
                    String fromUnit = null,
                     toUnit = null;

                    switch (choice) {
                        case 1 -> {
                            fromUnit = "Celsius";
                            toUnit = "Fahrenheit";
                            System.out.print("Enter temperature in Celsius: ");
                            inputTemperature = scanner.nextDouble();
                            convertedTemperature = (inputTemperature * 9 / 5) + 32;
                        }
                        case 2 -> {
                            fromUnit = "Fahrenheit";
                            toUnit = "Celsius";
                            System.out.print("Enter temperature in Fahrenheit: ");
                            inputTemperature = scanner.nextDouble();
                            convertedTemperature = (inputTemperature - 32) * 5 / 9;
                        }
                        case 3 -> {
                            fromUnit = "Kelvin";
                            toUnit = "Fahrenheit";
                            System.out.print("Enter temperature in Kelvin: ");
                            inputTemperature = scanner.nextDouble();
                            convertedTemperature = (inputTemperature - 273.15) * 9 / 5 + 32;
                        }
                        case 4 -> {
                            fromUnit = "Kelvin";
                            toUnit = "Celsius";
                            System.out.print("Enter temperature in Kelvin: ");
                            inputTemperature = scanner.nextDouble();
                            convertedTemperature = inputTemperature - 273.15;
                        }
                        case 5 -> {
                            fromUnit = "Celsius";
                            toUnit = "Kelvin";
                            System.out.print("Enter temperature in Celsius: ");
                            inputTemperature = scanner.nextDouble();
                            convertedTemperature = inputTemperature + 273.15;
                        }
                        case 6 -> {
                            fromUnit = "Fahrenheit";
                            toUnit = "Kelvin";
                            System.out.print("Enter temperature in Fahrenheit: ");
                            inputTemperature = scanner.nextDouble();
                            convertedTemperature = (inputTemperature - 32) * 5 / 9 + 273.15;
                        }
                        default ->
                            System.out.println("Invalid choice.");
                    }

                    System.out.println(inputTemperature + " " + fromUnit + " is " + convertedTemperature + " " + toUnit);

                default:
                    System.out.println("Invalid choice.");
            }
        }
        return false;

    }
}
