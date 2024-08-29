package ModernCalculate;

public abstract class Figure {
    private double length;
    private double width;
    private double height;
    private double radius;
    private double p = 3.12;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public double getP() {
        return p;
    }

    public Figure(double length, double width, double height, double radius, double p){
        this.length = length;
        this.width = width;
        this.height = height;
        this.radius = radius;
        this.p = p;
    }
    void currentS(){};
    void currentV(){}

}
