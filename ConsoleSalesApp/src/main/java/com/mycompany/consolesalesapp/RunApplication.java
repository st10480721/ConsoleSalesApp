package com.mycompany.consolesalesapp;

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the console device type: ");
        String consoleType = scanner.nextLine();

        System.out.print("Enter the store name: ");
        String storeName = scanner.nextLine();

        System.out.print("Enter the total amount of sales: ");
        int totalSales = scanner.nextInt();

        System.out.println(); // Blank line

        // Instantiate ConsoleSales object
        ConsoleSales salesReport = new ConsoleSales(consoleType, storeName, totalSales);

        // Print report
        salesReport.printReport();

        scanner.close();
    }
}