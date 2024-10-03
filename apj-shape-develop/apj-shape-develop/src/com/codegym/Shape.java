package com.codegym;

public class Shape interface Colorable {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }
    public class Square extends Rectangle implements Colorable {
        public Square() {
        }

        public Square(double side) {
            super(side, side);
        }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void howToColor() {
            System.out.println("Color all four sides.");
    }
    }
    public double getArea() {
            return super.getArea();
        }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled")
                + "Square with side=" + getWidth() + " has area=" + getArea();
    }
}
