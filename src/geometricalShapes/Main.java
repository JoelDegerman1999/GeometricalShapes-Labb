package geometricalShapes;

import java.util.Scanner;
import model.Circle;
import model.Rectangle;
import model.Triangle;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static boolean goAgain = false;

    public static void main(String[] args) {

        do {
            System.out.println("\nChoose a geometrical shape to calculate \n1. Circle\n2. Rectangle\n3. Triangle\n0. Exit");
            System.out.print("\nChoice: ");
            int geometricalChoice = sc.nextInt();

            switch (geometricalChoice) {
                case 1:
                    if (circleInterface()) {
                        goAgain = true;
                    } else {
                        goAgain = false;
                    }
                    break;
                case 2:
                    if (rectangleInterface()) {
                        goAgain = true;
                    } else {
                        goAgain = false;
                    }
                    break;

                case 3:
                    if (triangleInterface()) {
                        goAgain = true;
                    } else {
                        goAgain = false;
                    }
                    break;

                case 0:
                    goAgain = false;
                    break;

                default:
                    System.out.println("\nAnswer 1-4");
                    break;
            }

        } while (goAgain != false);
    }

    public static boolean circleInterface() {
        boolean goAgain = false;

        System.out.println("\nCircle choosen.");
        System.out.print("\nInput a radius: ");
        int radius = sc.nextInt();

        Circle circle = new Circle(radius);

        System.out.println("\nWould you like to calculate area or circumference?\n1. Area\n2. Circumfrence");
        System.out.print("\nInput a choice: ");
        int calcChoice = sc.nextInt();
        if (calcChoice == 1) {
            System.out.println("\nThe circle area is :" + circle.getArea());

            System.out.println("\nWant to calculate again?\n1. Yes \n2. No");
            int goAgainInt = sc.nextInt();
            if (goAgainInt == 1) {
                goAgain = true;
            } else {
                goAgain = false;
            }

        } else if (calcChoice == 2) {
            System.out.println("\nThe circle circumference is: " + circle.getCircumference());

            System.out.println("\nWant to calculate again?\n1. Yes \n2. No");
            System.out.print("\nChoice: ");
            int goAgainInt = sc.nextInt();
            if (goAgainInt == 1) {
                goAgain = true;
            } else {
                goAgain = false;
            }

        } else {
            System.out.println("\nStart over again");
            goAgain = true;
        }
        return goAgain;
    }

    public static boolean rectangleInterface() {
        boolean goAgain = false;

        System.out.println("\nRectangle choosen.");
        System.out.print("\nInput a base: ");
        int base = sc.nextInt();

        System.out.print("\nInput a height: ");
        int height = sc.nextInt();

        Rectangle rectangle = new Rectangle(base, height);

        System.out.println("\nWould you like to calculate area or circumference?\n1. Area\n2. Circumfrence");
        System.out.print("\nInput a choice: ");
        int calcChoice = sc.nextInt();
        if (calcChoice == 1) {
            System.out.println("\nThe rectangle area is :" + rectangle.getArea());

            System.out.println("\nWant to calculate again?\n1. Yes \n2. No");
            System.out.print("\nChoice: ");
            int goAgainInt = sc.nextInt();
            if (goAgainInt == 1) {
                goAgain = true;
            } else {
                goAgain = false;
            }
        } else if (calcChoice == 2) {
            System.out.println("\nThe rectangle circumference is: " + rectangle.getCircumference());

            System.out.println("\nWant to calculate again?\n1. Yes \n2. No");
            System.out.print("\nChoice: ");
            int goAgainInt = sc.nextInt();
            if (goAgainInt == 1) {
                goAgain = true;
            } else {
                goAgain = false;
            }
        } else {
            System.out.println("\nStart over again");
            goAgain = true;
        }
        return goAgain;
    }

    public static boolean triangleInterface() {
        boolean goAgain = false;

        System.out.println("\nTriangle choosen.");
        System.out.print("\nInput a base: ");
        int base = sc.nextInt();

        System.out.print("\nInput a height: ");
        int height = sc.nextInt();

        System.out.print("\nInput side one: ");
        int side1 = sc.nextInt();

        System.out.print("\nInput side two: ");
        int side2 = sc.nextInt();

        Triangle triangle = new Triangle(base, height, side1, side2);

        System.out.println("\nWould you like to calculate area or circumference?\n1. Area\n2. Circumfrence");
        System.out.print("\nInput a choice: ");

        int calcChoice = sc.nextInt();
        if (calcChoice == 1) {
            System.out.println("\nThe triangle area is :" + triangle.getArea());

            System.out.println("\nWant to calculate again?\n1. Yes \n2. No");
            System.out.print("\nChoice: ");
            int goAgainInt = sc.nextInt();
            if (goAgainInt == 1) {
                goAgain = true;
            } else {
                goAgain = false;
            }
        } else if (calcChoice == 2) {
            System.out.println("\nThe triangle circumference is: " + triangle.getCircumference());

            System.out.println("\nWant to calculate again?\n1. Yes \n2. No");
            System.out.print("\nChoice: ");
            int goAgainInt = sc.nextInt();
            if (goAgainInt == 1) {
                goAgain = true;
            } else {
                goAgain = false;
            }
        } else {
            System.out.println("\nStart over again");
            goAgain = true;
        }
        return goAgain;
    }

}
