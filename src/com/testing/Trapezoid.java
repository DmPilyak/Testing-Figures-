package com.testing;

public class Trapezoid extends Figure {
    private int sideLength;
    private int upperSideLength;
    private int downSideLength;
    private String color;

    public Trapezoid(int sideLength, int upperSideLength, int downSideLength, String color) {
        this.sideLength = sideLength;
        this.upperSideLength = upperSideLength;
        this.downSideLength = downSideLength;
        this.color = color;
    }

    @Override
    public void write() {
        System.out.println("Writing Trapezoid...");
    }

    @Override
    public double getArea() {
        return getMedian() * getHeight();
    }

    @Override
    public String getColor() {
        return color;
    }

    public int getSideLength() {
        return sideLength;
    }

    public int getUpperSideLength() {
        return upperSideLength;
    }

    public int getDownSideLength() {
        return downSideLength;
    }

    public double getMedian() {
        return (upperSideLength + downSideLength) / 2.0;
    }

    public double getHeight() {
        double pows = Math.pow(sideLength, 2) - (Math.pow((downSideLength - upperSideLength), 2) / 4);
        return Math.sqrt(pows);
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "sideLength=" + sideLength +
                ", upperSideLength=" + upperSideLength +
                ", downSideLength=" + downSideLength +
                ", color=" + color +
                ", height=" + getHeight() +
                ", area=" + getArea() +
                ", median=" + getMedian() + '\'' +
                '}';
    }
}
