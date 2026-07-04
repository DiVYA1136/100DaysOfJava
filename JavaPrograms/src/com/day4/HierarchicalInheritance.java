package com.day4;

class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle");
    }
}

class Rectangle extends Shape {
    void perimeter() {
        System.out.println("Perimeter of Rectangle");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.draw();
        c.area();

        Rectangle r = new Rectangle();
        r.draw();
        r.perimeter();
    }
}