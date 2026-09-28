package com.mycompany.consolesalesapp;

public class ConsoleSales extends Consoles {

    // Constructor
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    // Method to print the sales report
    public void printReport() {
        System.out.println("==========================================");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("==========================================");
        System.out.println("Console Device Type : " + getConsoleType());
        System.out.println("Store Name          : " + getStore());
        System.out.println("Total Amount Sales  : " + getTotalSales());
        System.out.println("==========================================");
    }
}