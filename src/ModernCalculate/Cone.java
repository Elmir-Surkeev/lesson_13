package ModernCalculate;

public class Cone extends Figure{
    private double obrazCone;
    public Cone(int length, int width, double height, double radius, double p, double obrazCone) {
        super(length, width, height, radius, p);
        this.obrazCone = obrazCone;
    }

    @Override
    void currentS() {
        double sWall = getP()*getRadius()*obrazCone;
        double sOsnovanie = getP()*(getRadius()*getRadius());
        double S = sWall+sOsnovanie;
        System.out.println("S = "+ S);
    }

    @Override
    void currentV() {
       double V = (getP()*(getRadius()*getRadius())*getHeight())/3;
       System.out.println("V = "+ V);
    }
}
