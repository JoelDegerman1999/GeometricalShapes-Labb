package model;

public class Triangle {

    private double base;
    private double height;
    private double side1;
    private double side2;

    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getArea() {
        return (base * height) / 2;
    }

    public double getCircumference() {
        return base + side1 + side2;
    }

    public void setTriangle(double base, double heigth, double side1, double side2) {
        if (base > 0 && heigth > 0 && side1 > 0 && side2 > 0) {
            this.base = base;
            this.height = heigth;
            this.side1 = side1;
            this.side2 = side2;
        }else{
            System.out.println("Needs to be bigger than 0");
        }
    }
}
