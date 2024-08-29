package ModernCalculate;

public class Cylinder extends Figure{
    public Cylinder(int length, int width, int height, double radius, double p) {
        super(length, width, height, radius, p);
    }
    void currentS(){
        double a = getP()* (getRadius()+getHeight());
        System.out.println("A = "+ a);
    };
    void currentV(){
        double V = getP()*(getRadius()*getRadius())*getHeight();
        System.out.println("V = "+ V);
    }
}
