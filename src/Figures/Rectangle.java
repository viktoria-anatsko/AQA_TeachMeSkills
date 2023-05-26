package Figures;

public class Rectangle extends Figures {
    public Rectangle(String figureType, int a, int b) {
        super(figureType);
        this.a = a;
        this.b = b;
    }

    int a;
    int b;

    @Override
    double calculateArea() {
        int s = a * b;
        return s;
    }

    @Override
    double calculatePerimeter() {
        double p = 2 * (a + b);
        return p;
    }
}
