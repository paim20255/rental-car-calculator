package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pickup date: ");
        String pickupDate = input.nextLine();

        System.out.print("Number of rental days: ");
        int rentalDays = input.nextInt();
        input.nextLine();

        System.out.print("Electronic toll tag  ($3.95/day? (yes/no): ");
        boolean tollTag = input.nextLine() .equalsIgnoreCase("yes");

        System.out.print("GPS ($2.95/day)? (yes/no): ");
        boolean gps = input.nextLine().equalsIgnoreCase("yes");

        System.out.print("Roadside assistance ($3.95/day)? (yes/no): ");
        boolean roadsideAssistance = input.nextLine().equalsIgnoreCase("yes");

        System.out.print("Enter your age.. Don't lie: ");
        int age = input.nextInt();

        // basic car rental
        double basicRental = 29.99 * rentalDays;

        // options cost
        double optionsCost = 0;
        if (tollTag) {
            optionsCost += 3.95 * rentalDays;
        }
        if (gps) {
            optionsCost += 2.95 * rentalDays;
        }
        if (roadsideAssistance) {
            optionsCost += 3.95 * rentalDays;
        }

        double underSurcharge = 0;
        if (age < 25) {
            underSurcharge = basicRental * .30;
        }

        // Total cost
        double totalCost = basicRental + optionsCost + underSurcharge;

        System.out.println();
        System.out.println("Pick up date: " + pickupDate);
        System.out.printf("Basic car rental: $%.2f%n", basicRental);
        System.out.printf("Option cost: $%.2f%n", optionsCost);
        System.out.printf("Under age driver: $%.2f%n", underSurcharge);
        System.out.printf("Total cost: $%.2f%n", totalCost);











    }

    }
