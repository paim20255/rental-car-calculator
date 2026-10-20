package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pickup date: ");
        String pickupDate = input.nextLine();


        int rentalDays = 2;

        boolean tollTag = true; //charge extra 3.95
        boolean GPS = false;
        boolean roadSideAssistance = true;

        int age = 29;

        double rentalCharge = 29.99 * rentalDays;

        if (age < 25) {
             rentalCharge = rentalCharge + (rentalCharge * .30);

        }
        if (tollTag) {
            rentalCharge = rentalCharge + (rentalDays * 3.95);
        }
        if (GPS) {
            rentalCharge = rentalCharge + (rentalCharge * 2.95);
        }
        if (roadSideAssistance) {
            rentalCharge = rentalCharge + (rentalCharge * 3.95);
        }
        double totalCost = 336.00;

        System.out.println("age: " + age);
        System.out.println("rental charge: " + rentalCharge);
        System.out.println("Would you like GPS?: " + rentalCharge);
        System.out.println("roadside assistance?: " + rentalCharge);

        System.out.println();
        System.out.println("Your total cost is: " + totalCost);




    }

    }
