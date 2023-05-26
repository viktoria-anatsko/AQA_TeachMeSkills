package Figures;

public abstract class Figures {
    private String figureType;
    final double PI = 3.14;

    public Figures(String figureType) {
        this.figureType = figureType;
    }

    public String getFigureType() {
        return figureType;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
