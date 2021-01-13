package com.testing;

public class Circle extends Figure{
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void write() {
        System.out.println("Writing Circle...");
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public double getDiagonal() {
        return radius + radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + color +
                ", diagonal=" + getDiagonal() +
                ", area=" + getArea() + '\'' +
                '}';
    }
}
