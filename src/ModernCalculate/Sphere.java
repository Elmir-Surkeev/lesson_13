package ModernCalculate;

public class Sphere extends Figure{
    public Sphere(int length, int width, double height, double radius, double p) {
        super(length, width, height, radius, p);
    }
    void currentS(){
        double S = (4*getP()) * (getRadius()*2) ;
        System.out.println("S = "+ S);
    }
    void currentV(){
        double V = (4*getP()) * (getRadius()*3)/3 ;
        System.out.println("V = "+ V);
    }
}
