package com.bearsoldiers.foo.foo01;

import java.util.Locale;

public class Foo {
    public static void main(String[] args) {
        // Methods
        System.out.println("Methods"); // Built in methods
        String brand = "iPhone";
        System.out.println(brand.toUpperCase(Locale.ROOT)); // Built in methods


        // Understanding methods
        char [] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        int count = countOccurrences(letters, 'Z');
        System.out.println(count);
    }

    public static int countOccurrences(char [] letters, char c) {
        System.out.println("Method invoked");
        int count = 0;
                for(char chr : letters){
                    if(c == chr){
                        count++;
                    }
                }
        return count;
    }
}
