package geometricalShapes;

import java.util.Scanner;
import model.Circle;
import model.Rectangle;
import model.Triangle;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int calcChoice;
        int base;
        int height;
        int goAgainInt;

        boolean goAgain = false;

        do {
            System.out.println("\nChoose a geometrical shape to calculate \n1. Circle\n2. Rectangle\n3. Triangle\n0. Exit");
            System.out.print("\nChoice: ");
            int geometricalChoice = sc.nextInt();

            switch (geometricalChoice) {
                case 1:
                    System.out.println("\nCircle choosen.");
                    System.out.print("\nInput a radius: ");
                    int radius = sc.nextInt();

                    Circle circle = new Circle(radius);

                    System.out.println("\nWould you like to calculate area or circumference?\n1. Area\n2. Circumfrence");
                    System.out.print("\nInput a choice: ");
                    calcChoice = sc.nextInt();
                    if (calcChoice == 1) {
                        System.out.println("\nThe circle area is :" + circle.getArea());

                        System.out.println("\nWant to calculate again?\n1. Yes \n2. No");
                        goAgainInt = sc.nextInt();
                        if (goAgainInt == 1) {
                            goAgain = true;
                        } else {
                            goAgain = false;
                        }

                    } else if (calcChoice == 2) {
                        System.out.println("\nThe circle circumference is: " + circle.getCircumference());

                        System.out.println("\nWant to calculate again?\n1. Yes \n2. No");
                        System.out.print("\nChoice: ");
                        goAgainInt = sc.nextInt();
                        if (goAgainInt == 1) {
                            goAgain = true;
                        } else {
                            goAgain = false;
                        }

                    } else {
                        System.out.println("Start over again");
                        goAgain = true;
                    }
                    break;

                case 2:
                    System.out.println("\nRectangle choosen.");
                    System.out.print("\nInput a base: ");
                    base = sc.nextInt();

                    System.out.print("\nInput a height: ");
                    height = sc.nextInt();

                    Rectangle rectangle = new Rectangle(base, height);

                    System.out.println("\nWould you like to calculate area or circumference?\n1. Area\n2. Circumfrence");
                    System.out.print("\nInput a choice: ");
                    calcChoice = sc.nextInt();
                    if (calcChoice == 1) {
                        System.out.println("\nThe rectangle area is :" + rectangle.getArea());

                        System.out.println("\nWant to calculate again?\n1. Yes \n2. No");
                        System.out.print("\nChoice: ");
                        goAgainInt = sc.nextInt();
                        if (goAgainInt == 1) {
                            goAgain = true;
                        } else {
                            goAgain = false;
                        }
                    } else if (calcChoice == 2) {
                        System.out.println("\nThe rectangle circumference is: " + rectangle.getCircumference());

                        System.out.println("\nWant to calculate again?\n1. Yes \n2. No");
                        System.out.print("\nChoice: ");
                        goAgainInt = sc.nextInt();
                        if (goAgainInt == 1) {
                            goAgain = true;
                        } else {
                            goAgain = false;
                        }
                    } else {
                        System.out.println("Start over again");
                        goAgain = true;
                    }
                    break;

                case 3:
                    System.out.println("\nTriangle choosen.");
                    System.out.print("\nInput a base: ");
                    base = sc.nextInt();

                    System.out.print("\nInput a height: ");
                    height = sc.nextInt();

                    Triangle triangle = new Triangle(base, height);

                    System.out.println("\nWould you like to calculate area or circumference?\n1. Area");
                    System.out.print("\nInput a choice: ");

                    calcChoice = sc.nextInt();
                    if (calcChoice == 1) {
                        System.out.println("\nThe triangle area is: " + triangle.getArea());

                        System.out.println("\nWant to calculate again?\n1. Yes \n2. No");
                        System.out.print("\nChoice: ");
                        goAgainInt = sc.nextInt();
                        if (goAgainInt == 1) {
                            goAgain = true;
                        } else {
                            goAgain = false;
                        }
                    } else {
                        System.out.println("\nStart over again");
                        goAgain = true;
                    }
                    break;

                case 0:
                    goAgain = false;
                    break;

                default:
                    System.out.println("\nAnswer 1-4");
            }

        } while (goAgain != false);
    }

}
