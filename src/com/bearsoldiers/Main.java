package com.bearsoldiers;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Hello World");

        //Variables and Reserved key words
        // Primitive datatypes
        int a = 100;
        String b = "Monish";
        long c = 100;
        double d = 1.02;
        Date date = new Date();

        /*we can
         underscores
          between numbers*/
        byte theByte = -123; // -128 to 127 - 1 byte
        short theShort = 200; // -32,768 to 32767 - 2 bytes
        int theInt = 100; // -2147483648 to 2147483647 - 4 bytes
        float theFloat = 3.14F; // Capital F or lowercase f 6 to 7 decimal digits
        double theDouble = 3.1415; // 15 decimal digits
        long theLong = 100000000000000000L; // -9223372036854775808 to 9223372036854775807 - 8 bytes add a lower case l or upper case L

        boolean isBoolean = true; // false
        char theChar = 'M';
        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theInt);
        System.out.println(theByte);
        System.out.println(theFloat);
        System.out.println(theDouble);
        System.out.println(theLong);
        System.out.println(isBoolean);
        System.out.println(theChar);

        // Non primitive datatypes Reference types
        // Always starts with upper case where as primitive starts with lower case
        String name = new String("Monish");
        // name. will give many behaviors and attributes
        System.out.println(name.toUpperCase(Locale.ROOT));
        LocalDate now = LocalDate.now();
        System.out.println(now.getDayOfMonth());


//        Difference between primitive and reference types
        System.out.println("Difference between primitive and reference types");
        int _a = 10; // memory block addr:200
        int _b = _a; // addr:201 - stores a copy of _a
        _a = 100; // changes the value in addr:200 and it does not change the value stored in addr:201
        System.out.println("a:" + a + "- b:" + _b);

        System.out.println("Reference types");
        Person bob = new Person("bob");
        Person alice = bob;
        alice.name = "alice";
        System.out.println(bob.name + "" + alice.name);


//        String class

        System.out.println("String class");
        String theName = new String("Monish");
        System.out.println(theName.toUpperCase(Locale.ROOT));
        System.out.println(theName.toLowerCase(Locale.ROOT));
        System.out.println(theName.charAt(1));
        System.out.println(theName.contains("oni"));
        System.out.println(theName.equals("monish"));


    }

    // Class name should start with capital letter
    static class Person {

        public String name;

        Person(String name){
            this.name = name;
        }
    }
}
