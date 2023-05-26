package Figures;

public class Circle extends Figures {
    public Circle(String figureType, double radius) {
        super(figureType);
        this.radius = radius;
    }

    double radius;

    @Override
    double calculateArea() {
        double s = PI * radius * radius;
        return s;
    }

    @Override
    double calculatePerimeter() {
        double c = 2 * PI * radius;
        return  c;
    }
}
