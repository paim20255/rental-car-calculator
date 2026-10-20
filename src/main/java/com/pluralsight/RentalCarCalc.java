package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalc {
    public static void main(String[] args) {
        String pickupDate = "Tuesday";
        int rentalDays = 3;

        boolean tollTag = true; //charge extra 3.95
        boolean GPS = false;
        boolean roadSideAssistance = true;

        int age = 22;


        double rentalCharge = 29.99 * rentalDays;

        if (age < 25) {
             rentalCharge = rentalCharge + (rentalCharge * .30);

        }
        if (tollTag) {
            rentalCharge = rentalCharge + (rentalDays * 3.95);
        }

        System.out.println("age: " + age);
        System.out.println("rental charge: " + rentalCharge);



    }

    }
