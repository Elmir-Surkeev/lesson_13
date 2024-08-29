package ModernCalculate;

public class Cone extends Figure{
    private int obrazCone;
    public Cone(int length, int width, int height, double radius, double p, int obrazCone) {
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
