package com.tw.vapasi;

/**
 * Understand a figure with four straight sides and four right angles, with unequal adjacent sides.
 */
public class RectangleCalculator {
    private int length;
    private int width;

    public RectangleCalculator(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }
}
