package model;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }else{
            System.out.println("Needs to be bigger than 0");
        }
    }

    public double getArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    public double getCircumference() {
        double circumference = Math.PI * 2 * radius;
        return circumference;
    }
}
