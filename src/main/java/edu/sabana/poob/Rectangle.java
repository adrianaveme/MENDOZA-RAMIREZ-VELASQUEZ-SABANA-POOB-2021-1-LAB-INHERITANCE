package edu.sabana.poob;

public class Rectangle extends Shape {

    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
        super();
    }

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.length = lenght;
    }

    public Rectangle(String color, double width, double lenght) {
        super(color);
        this.width = width;
        this.length = lenght;
    }

    public double getWidth() {
        return width;
    }

    public Object getDiagonal() {
        return Math.hypot(width,length);
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter(){
        return (2*width+2*length);
    }



}
