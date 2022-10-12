package oop.parcial2;

public class Square extends Shape {

    private int side;


    public Square(int side) {
        super("Square", 4);

        this.side = side;

    }


    public double getPerimeter() {
        return 4 * side;

    }

    public double getArea() {
        return side^2;
    }


}