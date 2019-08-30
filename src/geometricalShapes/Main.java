package geometricalShapes;

import model.Circle;
import model.Rectangle;
import model.Triangle;

public class Main {

    public static void main(String[] args) {

        Circle cirkel = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 10);
        Triangle triangle = new Triangle(10, 15, 12, 12);

        System.out.println("Area on the circle is: " + cirkel.getArea()
                + "\nCircumference on the circle is: " + cirkel.getCircumference());
        System.out.println("Area on the rectangle is: " + rectangle.getArea()
                + "\nCircumference on the rectangle is: " + rectangle.getCircumference());
        System.out.println("Area on the triangle is: " + triangle.getArea()
                + "\nCircumference on the triangle is: " + triangle.getCircumference());

    }

}
