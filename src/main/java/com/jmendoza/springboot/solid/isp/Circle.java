package com.jmendoza.springboot.solid.isp;

public class Circle implements CircumferenceShape {

    private double radius;
    private Printer printer;

    public Circle(double radius, Printer printer) {
        this.radius = radius;
        this.printer = printer;
    }

    @Override
    public void calculateCircumference() {
        printer.printValue(String.valueOf(3.14f * 2 * radius));
    }

    @Override
    public void calculateArea() {
        printer.printValue(String.valueOf(3.14f * radius * radius));
    }
}