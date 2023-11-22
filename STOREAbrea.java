/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package store.Arbea;

import javax.swing.JOptionPane;

/**
 *
 * @author St. Michael
 */
public class STOREAbrea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Wellcome to Abrea School Supply.");
         while (true) {
            // Input customer name
            String customerName = JOptionPane.showInputDialog("Enter your name:");
            if (customerName == null) {
                break; // User clicked cancel or closed the input dialog
            }

            // Product names and prices
            String[] products = { "Pencil", "Notebook", "Backpack", "Ruler", "Eraser" };
            double[] prices = { 15, 35, 1000, 40, 10 };

            double totalCost = 0.0;

            // Shopping loop
            while (true) {
                // Display product options
                StringBuilder productList = new StringBuilder("Available Products:\n");
                for (int i = 0; i < products.length; i++) {
                    productList.append(i + 1).append(". ").append(products[i]).append(" - Php").append(prices[i]).append("\n");
                }

                int choice;
                try {
                    String input = JOptionPane.showInputDialog(productList.toString() + "Enter product number (0 to finish shopping):");
                    if (input == null) {
                        break; // User clicked cancel or closed the input dialog
                    }
                    choice = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
                    continue;
                }

                if (choice == 0) {
                    break; // Exit shopping loop
                } else if (choice >= 1 && choice <= products.length) {
                    int quantity;
                    try {
                        quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity:"));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
                        continue;
                    }

                    if (quantity > 0) {
                        double productPrice = prices[choice - 1];
                        double productTotal = productPrice * quantity;
                        totalCost += productTotal;

                        JOptionPane.showMessageDialog(null, "Added " + quantity + " " + products[choice - 1] + " to the cart.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid quantity. Please enter a positive number.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please enter a number between 0 and " + products.length + ".");
                }
            }

            if (totalCost == 0) {
                JOptionPane.showMessageDialog(null, "No items selected. Exiting.");
                break; // Exit the program
            }

            // Input cash loop
            double cash = 0;
            do {
                try {
                    String inputCash = JOptionPane.showInputDialog("Hello, " + customerName + "! Total cost: Php" + totalCost + "\nEnter cash amount:");
                    if (inputCash == null) {
                        JOptionPane.showMessageDialog(null, "Transaction canceled. No cash provided.");
                        break;
                    }
                    cash = Double.parseDouble(inputCash);
                    if (cash < totalCost) {
                        JOptionPane.showMessageDialog(null, "Insufficient cash. Please provide enough money.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid cash amount.");
                }
            } while (cash < totalCost);

            if (cash >= totalCost) {
                // Calculate change
                double change = cash - totalCost;

                // Display receipt
                StringBuilder receipt = new StringBuilder("Receipt for " + customerName + ":\n");
                for (int i = 0; i < products.length; i++) {
                    receipt.append(products[i]).append(" x ").append(0).append("\n");
                }
                receipt.append("Total cost: Php").append(totalCost).append("\n");
                receipt.append("Cash provided: Php").append(cash).append("\n");
                receipt.append("Change: Php").append(change).append("\n");

                JOptionPane.showMessageDialog(null, receipt.toString(), "Transaction Summary", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
