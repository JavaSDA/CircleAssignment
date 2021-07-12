package com.company;

public class Circle {
    // Declaring the features of a circle.
    private int radius;

    // Getters and setters
    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        // use the this keyword to differentiate between
        // the instance of the object's field and the parameter
        // you're passing.
        this.radius = radius;
    }

    // Constructors do not have a return type
    public Circle() {
        // empty constructor
    }

    // use constructor overloading
    public Circle(int radius) {
        // set the instance property to the parameters
        this.radius = radius;
    }

    // method to find the area of the circle
    public float getArea() {
        // Formula for area of a circle is
        // PI * radius^2
        return (float) (Math.PI * Math.pow(this.radius, 2));
    }

    // method to find the circumference of the circle
    public float getCircumference() {
        // Formula for circumference of a circle is
        // 2 * PI * radius.
        return (float) (2 * Math.PI * this.radius);
    }


}
