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

        System.out.print("Electronic toll tag  ($3.95/day? (yes/no)");
        boolean tollTag = input.nextLine() .equalsIgnoreCase("yes");

        System.out.print("GPS ($2.95/day)? (yes/no): ");
        boolean gps = input.nextLine().equalsIgnoreCase("yes");








    }

    }
