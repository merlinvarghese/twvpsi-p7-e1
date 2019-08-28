package com.tw.vapasi;

/**
 * Understand a figure with four straight sides and four right angles.
 */
public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(int side) {
        this(side, side);
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }
}
