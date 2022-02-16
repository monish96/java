package com.bearsoldiers.bar.bar01;

import java.time.LocalDate;
import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        System.out.println("Scanner");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String username = scanner.nextLine();
        System.out.println("Hello " + username);
        System.out.println("what is your age?");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("Year of your birth is" + year);

        if(age < 18){
            System.out.println("You are young");
        }else{
            System.out.println("You are old");
        }
    }
}
