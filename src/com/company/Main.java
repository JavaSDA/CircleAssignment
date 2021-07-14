package com.company;

public class Main {

    public static void main(String[] args) {
        // Assignment
// Write a Circle class, that takes in the radius as a field
// Create 2 constructors, one with the field as a parameter and one without.
// write methods to find the circumference and area of the circle

//        The radius should be taken from the user

        // Instantiate our circle class.
        // firstCircle is an instance of the object of the type Circle.
        Circle firstCircle = new Circle();
        firstCircle.setRadius(7);

        System.out.println("Area of firstCircle: " + firstCircle.getArea());
        System.out.println("Circumference of firstCircle: " + firstCircle.getCircumference());

        // Another instance of the circle object
        Circle secondCircle = new Circle(14);
        System.out.println("Area of secondCircle: " + secondCircle.getArea());
        System.out.println("Circumference of secondCircle: " + secondCircle.getCircumference());


    }

    // 1st Task: Loops. 10mins.
    // Write a program that counts in descending order from 100 - 0;
    // Print out only the values that are divisible by 6.

    // 2nd Task: Average
    // Write a program that takes input from the user for 10 numbers and
    // find the average of those numbers.

    // 3rd Task: Strings.
    // Write a program that takes in 5 strings from the user
    // and concatenates those strings into one sentence.
    // Enter a string : Harry
    // Enter a string : is
    // ...
    // Harry is ...

    // 4th Task:
    // Write a program that allows or takes in 10 numbers as an array
    // finds the largest number.

    // 5th Task:
    // Using an array, output the number of odd numbers
    // out of the numbers a user has entered. i.e. allow the
    // user to enter a number of numbers and return or output the number of odd
    // numbers.

    // Enter how many numbers you want: 6
    // Enter a number
    // enter a number
    //...
    // the number of odd numbers is ...

    // 6th Task:
    // Create a class called Vehicle. Let this vehicle have features like,
    // length of the vehicle, the number of seats,
    // no of tires, name/brand of the vehicle, current speed.
    //
    // methods include: speed up(increases speed by 5), slow down (reduce speed by 5), start engine, stop engine.

    // 16th
    // 14th and 26th ( 30 min)

    // Time: 40mins.
    // more after these...



}
