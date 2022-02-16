package com.bearsoldiers;

import java.time.LocalDate;
import java.util.Arrays;
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


//        Arithmetic operator

        System.out.println(10 + 2);
        System.out.println(10 - 2);
        System.out.println(10 * 2);
        System.out.println(10 % 2);

//The Math class

        System.out.println(Math.abs(-10));
        System.out.println(Math.max(10,20));
        System.out.println((int) Math.pow(2,10)); // To get whole number add int as mentioned instead getting a decimal
        System.out.println(Math.min(10,20));
        System.out.println(Math.sqrt(4));

//Comparison Operator

        int myAge = 25;
        int someonesAge = 18;
        boolean isMyAgeGreaterThanSomeonesAge = myAge > someonesAge;
        System.out.println(isMyAgeGreaterThanSomeonesAge);
        System.out.println(myAge < someonesAge);
        System.out.println(myAge == someonesAge);
        System.out.println(myAge != someonesAge);

//  Logical operator

        boolean isAdult = true;
        boolean isChild = false;
        boolean isBearsoldiers = true;
        System.out.println(isChild && isAdult); // AND
        System.out.println(isChild || isAdult); // OR
        System.out.println((!isChild || isAdult) && isBearsoldiers);
        System.out.println(isAdult);
        System.out.println(!isChild);



        // if statements

        int age = 18;

        if(age == 18){
            System.out.println("You are an adult");
        }else{
            System.out.println("you are not an adult");
        }

        if(age > 18) {
            System.out.println("You are greater than 18");
        }else if(age < 18){
            System.out.println("You are younger than 18");
        }else {
            System.out.println("You are 18");
        }

//Ternary operator


        String message = age >= 18 ? "You are an adult" : "You are not an adult";
        System.out.println(message);

        //    Switch Statements

        String gender = "FEMALE";

        if(gender.equals("MALE")){
            System.out.println("You are a male");
        }else if(gender.equals("FEMALE")){
            System.out.println("You are a female");
        }else {
            System.out.println("Not applicable");
        }

        switch (gender){
            case "MALE":
                System.out.println("Male");
                break; // Java 11 needs it
            case "Female":
                System.out.println("Female");
                break;
            default:
                System.out.println("Prefer not to say");
                // no need add break for default
        }


//        Arrays

        int [] categories = new int[5];
        boolean [] categoriesBoolean = new boolean[5];
        String [] categoriesStrings = new String[5];
        System.out.println(Arrays.toString(categories)); // Array class should be imported
        System.out.println(Arrays.toString(categoriesBoolean));
        System.out.println(Arrays.toString(categoriesStrings));
        // Arrays in Java starts from zero. Lua starts from 1
        categories[0] = 1;
//        categories[6] = 1; // we will get error here Index 6 out of bounds for length 5
        System.out.println(Arrays.toString(categories));

        // Simple form of array
        int [] simple = {2,0,1, 100};
        System.out.println(Arrays.toString(simple));

        // Length property
        System.out.println(simple.length);

        String [] stringArray = {"monish" , "bear soldiers"};

        System.out.println(Arrays.toString(stringArray));
        System.out.println(stringArray.length);

        // Arrays and indexes

        int [] example1 = {2,3,4,6,100};

        int oneHundred = example1[4];
        int four = example1[2];
        int lastElement = example1[example1.length - 1];
        System.out.println(oneHundred);
        System.out.println(four);
        System.out.println(lastElement);

        // Loops control structures

        for(int i = 0; i < example1.length; i++){
            System.out.println(example1[i]);
        }

        // Enhanced for loops
        for(int j : example1){
            System.out.println(j);
        }

        for (int i : example1) {
            System.out.println(i);
        }

        // example1.for

        for (int i = 0; i < example1.length; i++) {

            if(example1[i]%2 == 0){
                continue;
            }

            System.out.println(example1[i]);

            if(example1[i] == 4){
                break;
            }
        }

        // Advance
        Arrays.stream(example1).forEach(System.out::println);

        // While loop

        System.out.println("While loop");
        int count = 0;
        while(count < 5){
            System.out.println(count);
            count++;
        }

        // Do While loop

        System.out.println("do While loop");
        int doCount = 5;
        do{
            System.out.println(doCount);
            doCount++;
        }while(doCount < 5);


//        System.out.println("Scanner");




        // End of block
    }



    // Class name should start with capital letter
    static class Person {

        public String name;

        Person(String name){
            this.name = name;
        }
    }
}
