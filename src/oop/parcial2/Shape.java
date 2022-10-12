package oop.parcial2;

public abstract class Shape {
    private String name;
    private int sidesCount;

    public Shape(String name, int sidesCount){
        this.name = name;
        this.sidesCount = sidesCount;

    }

    public abstract double getPerimeter();
    public abstract double getArea();



    public String getName() {
        return name;
    }

    public int getSidesCount() {
        return sidesCount;
    }


}
