/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seriesapplication;

import java.util.ArrayList;
import java.util.Scanner;

public class SeriesApplication {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<SeriesModel> seriesList = new ArrayList<>();

    public static void main(String[] args) {
        SeriesApplication seriesApp = new SeriesApplication();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLatest Series - 2025");
            System.out.println("**********************************");
            System.out.println("Enter (1) to launch menu or any other key to exit");
            String input = scanner.nextLine();

            if (input.equals("1")) {
                seriesApp.showMenu(); //Show the menu if user enters 1
            } else {
                System.out.println("Exiting program. Goodbye!");
                break; // Exit the loop and stop the program
            }
        }

        scanner.close(); //close the scanner after the loop
    }

    private void showMenu() {
        while (true) {
            System.out.println("\n1. Capture Series");
            System.out.println("2. Search Series");
            System.out.println("3. Update Series");
            System.out.println("4. Delete Series");
            System.out.println("5. View Report");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    CaptureSeries();
                    break;
                case "2":
                    SearchSeries();
                    break;
                case "3":
                    UpdateSeries();
                    break;
                case "4":
                    DeleteSeries();
                    break;
                case "5":
                    SeriesReport();
                    break;
                case "6":
                    ExitSeriesApplication();
                    return; //Exit the menu loop
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public void CaptureSeries() {
        System.out.println("Enter Series ID:");
        String id = scanner.nextLine();

        System.out.println("Enter Series Name:");
        String name = scanner.nextLine();

        String age;
        while (true) {
            System.out.println("Enter Age Restriction (2-18):");
            age = scanner.nextLine();
            if (age.matches("\\d+")) {
                int ageNum = Integer.parseInt(age);
                if (ageNum >= 2 && ageNum <= 18) break;
                else System.out.println("Invalid age. Enter between 2 and 18.");
            } else {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        System.out.println("Enter Number of Episodes:");
        String episodes = scanner.nextLine();

        SeriesModel sm = new SeriesModel(id, name, age, episodes);
        seriesList.add(sm);
        System.out.println("Series captured successfully!");
    }

    public void SearchSeries() {
        System.out.println("Enter Series ID to search:");
        String id = scanner.nextLine();

        for (SeriesModel sm : seriesList) {
            if (sm.SeriesId.equals(id)) {
                display(sm);
                return;
            }
        }
        System.out.println("No series data found.");
    }

    public void UpdateSeries() {
        System.out.println("Enter Series ID to update:");
        String id = scanner.nextLine();

        for (SeriesModel sm : seriesList) {
            if (sm.SeriesId.equals(id)) {
                System.out.println("Enter new name:");
                sm.SeriesName = scanner.nextLine();

                String age;
                while (true) {
                    System.out.println("Enter new age restriction (2-18):");
                    age = scanner.nextLine();
                    if (age.matches("\\d+")) {
                        int ageNum = Integer.parseInt(age);
                        if (ageNum >= 2 && ageNum <= 18) break;
                        else System.out.println("Invalid age. Enter between 2 and 18.");
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                    }
                }
                sm.SeriesAge = age;

                System.out.println("Enter new number of episodes:");
                sm.SeriesNumberOfEpisodes = scanner.nextLine();

                System.out.println("Series updated successfully!");
                return;
            }
        }
        System.out.println("Series not found.");
    }

    public void DeleteSeries() {
        System.out.println("Enter Series ID to delete:");
        String id = scanner.nextLine();

        for (SeriesModel sm : seriesList) {
            if (sm.SeriesId.equals(id)) {
                System.out.println("Are you sure you want to delete this series? (yes/no):");
                if (scanner.nextLine().equalsIgnoreCase("yes")) {
                    seriesList.remove(sm);
                    System.out.println("Series deleted successfully.");
                } else {
                    System.out.println("Deletion cancelled.");
                }
                return;
            }
        }
        System.out.println("Series not found.");
    }

    public void SeriesReport() {
        System.out.println("Series Report:");
        for (SeriesModel sm : seriesList) {
            display(sm);
        }
    }

    private void display(SeriesModel sm) {
        System.out.println("ID: " + sm.SeriesId);
        System.out.println("Name: " + sm.SeriesName);
        System.out.println("Age Restriction: " + sm.SeriesAge);
        System.out.println("Episodes: " + sm.SeriesNumberOfEpisodes);
        System.out.println("----------------------");
    }

    public void ExitSeriesApplication() {
        System.out.println("Thank you for using the system. Goodbye!");
        System.exit(0);
    }
}

