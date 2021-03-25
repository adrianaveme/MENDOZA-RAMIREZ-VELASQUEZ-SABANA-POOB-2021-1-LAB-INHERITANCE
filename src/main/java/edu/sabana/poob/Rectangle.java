package edu.sabana.poob;

public class Rectangle extends Shape {

    private double width = 1.0;
    private double lenght = 1.0;

    public Rectangle() {
        super();
    }

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, double width, double lenght) {
        super(color);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }
}
