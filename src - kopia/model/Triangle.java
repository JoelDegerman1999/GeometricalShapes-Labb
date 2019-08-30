package model;

public class Triangle {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.height = base;
        this.base = height;

    }

    public double getArea() {
        return (base * height) / 2;
    }


    public void setTriangle(double base, double heigth, double side1, double side2) {
        if (base > 0 && heigth > 0 && side1 > 0 && side2 > 0) {
            this.base = base;
            this.height = heigth;
            this.height = side1;
            this.base = side2;
        } else {
            System.out.println("Needs to be bigger than 0");
        }
    }
}
