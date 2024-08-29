package ModernCalculate;

public abstract class Figure {
    private int length;
    private int width;
    private int height;
    private double radius;
    private double p = 3.12;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public Figure(int length, int width, int height, double radius, double p){
        this.length = length;
        this.width = width;
        this.height = height;
        this.radius = radius;
        this.p = p;
    }
    void currentS(){};
    void currentV(){}

}
