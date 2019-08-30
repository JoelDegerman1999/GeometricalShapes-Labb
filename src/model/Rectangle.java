package model;

public class Rectangle {

    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void setRectangle(double base, double height) {
        if (base > 0 && height > 0) {
            this.base = base;
            this.height = height;
        }else{
            System.out.println("Needs to be bigger than 0");
        }
    }

    public double getArea() {
        return base * height;
    }

    public double getCircumference() {
        return (2 * base) + (2 * height);
    }
}
