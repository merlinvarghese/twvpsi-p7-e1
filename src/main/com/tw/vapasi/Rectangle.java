package com.tw.vapasi;

/**
 * Understand a figure with four straight sides and four right angles.
 */
public class Rectangle {
    private int length;
    private int width;

    private Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    private Rectangle(int side) {
        this(side, side);
    }

    public static Rectangle createRectangle(int length, int breadth) {
        return new Rectangle(length, breadth);
    }

    public static Rectangle createSquare(int side) {
        return new Rectangle(side);
    }


    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }
}
