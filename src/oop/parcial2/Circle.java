package oop.parcial2;

public class Circle extends Shape {

    private int radio;


    public Circle(int radio) {

        super("Circle", 0);
        this.radio = radio;

    }

    public double getPerimeter(){
        //return PI * (2*radio);
        return Math.PI * radio * 2;

    }

    public double getArea(){
        return Math.PI * Math.pow(radio,2);
    }



}
