package com.testing;

public class Triangle extends Figure {
    private int sideLength;
    private String color;

    public Triangle(int sideLength, String color) {
        this.sideLength = sideLength;
        this.color = color;
    }

    @Override
    public void write() {
        System.out.println("Writing Triangle...");
    }

    @Override
    public double getArea() {
        return (Math.pow(sideLength, 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public String getColor() {
        return color;
    }

    public int getSideLength() {
        return sideLength;
    }

    public double getHeight() {
        return Math.sqrt(3) / 2 * sideLength;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideLength=" + sideLength +
                ", color=" + color +
                ", height=" + getHeight() +
                ", area=" + getArea() +'\'' +
                '}';
    }
}
