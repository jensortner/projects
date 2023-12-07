package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Get fridge/freezer id.
        Scanner scanner = new Scanner();
        System.out.println("Enter freezer/fridge ID");
        String id = scanner.next();
        System.out.println("Enter current temperature");
        long temp = scanner.nextLong();

        //check if id exists
        boolean idExists = IdExists(id);



    }
}