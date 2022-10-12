package oop.parcial2;

public class Triangle extends Shape {
    private int bottom;
    private int height;

    public Triangle(int bottom, int height) {
        super("Triangle", 3);
        this.bottom = bottom;
        this.height = height;
    }

    public double getPerimeter(){
        return bottom + height;
    }

    public double getArea(){
        return (bottom * height)/2;
    }
}
