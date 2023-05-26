package Figures;

public class Main {
    public static void main(String[] args) {
        createArrayOfFigures();
    }

    public static void createArrayOfFigures() {

        Figures[] array = {
                new Triangle("Triangle", 9, 12, 7),
                new Circle("Circle1", 4),
                new Circle("Circle2", 8),
                new Rectangle("Rectangle1", 12, 17),
                new Rectangle("Rectangle2", 3, 4)
        };

        for (int i = 0; i < array.length; i++) {
            System.out.println("Area of a " + array[i].getFigureType() + ": " + array[i].calculateArea());
        }

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i].calculatePerimeter();
        }
        System.out.println();
        System.out.println("Sum of perimeters of all figures is " + sum);
    }
}

