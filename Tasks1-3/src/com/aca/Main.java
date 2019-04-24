package com.aca;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        //task 1==============================================================================
        //depends not only on age, but also on birthday
        System.out.println("year of birth: " + ld.minusYears(age).getYear() + " or " + (ld.minusYears(age).getYear() - 1));


        //task 2===============================================================================
        ld = LocalDate.now();
        LocalDate previousFriday = LocalDate.now();
        LocalDate nextFriday = LocalDate.now();

        //next
        for (int i = 1; i <= 7; i++) {
            if (ld.plusDays(i).getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                nextFriday = ld.plusDays(i);
            }
        }
        System.out.println("next friday: " + nextFriday);

        //previous
        for (int i = 1; i <= 7; i++) {
            if (ld.minusDays(i).getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                previousFriday = ld.minusDays(i);
            }
        }
        System.out.println("previous friday: " + previousFriday);


        //task 3=============================================================================
        System.out.print("Please enter year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
    }


}
