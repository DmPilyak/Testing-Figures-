package com.testing;

public class Square extends Figure {
    private int sideLength;
    private String color;

    public Square(int sideLength, String color) {
        this.sideLength = sideLength;
        this.color = color;
    }

    @Override
    public void write() {
        System.out.println("Writing Square...");
    }

    @Override
    public double getArea() {
        return Math.pow(sideLength, 2);
    }

    @Override
    public String getColor() {
        return color;
    }

    public int getSideLength() {
        return sideLength;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * sideLength;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                ", color=" + color +
                ", diagonal=" + getDiagonal() +
                ", area=" + getArea() + '\'' +
                "}";
    }
}
