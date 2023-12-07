package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication

public class Main implements CommandLineRunner {

    @Autowired
    IdExists idExists;
    @Override
    public void run(String... args) throws Exception {

        SpringApplication.run(Main.class, args);

    }
    public static void main(String[] args) {


        //Get fridge/freezer id.
        Scanner scanner = new Scanner();
        System.out.println("Enter freezer/fridge ID");
        String id = scanner.next();
        System.out.println("Enter current temperature");
        long temp = scanner.nextLong();
        ;

    }

}