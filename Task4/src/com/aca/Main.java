package com.aca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert date format: ");
        String dFormat = scanner.nextLine();

        try {
            new DateTimeFormatterBuilder().appendPattern(dFormat);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dFormat);


            System.out.print("enter date: ");
            String date = scanner.nextLine();

            LocalDate ld2 = LocalDate.parse(date,dtf);

            System.out.println(dtf.format(ld2));

            long diff = ChronoUnit.DAYS.between(ld, ld2);
            System.out.println("difference beetwen today and inputed date is " + diff + " days");

        } catch (IllegalArgumentException e) {
            System.out.println("Wrong date format was entered");
        }

    }
}
