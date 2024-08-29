package ModernCalculate;

public class PPD extends Figure{
    public PPD(int length, int width, int height, double radius, double p) {
        super(length, width, height, radius, p);
    }
    void currentS(){
        double S = 2*((getLength()+getHeight())+(getLength()+getWidth()) + (getWidth()+getHeight()));
        System.out.println("S = "+ S);
    }
    void currentV(){
        double V = getLength()*getWidth()*getHeight();
        System.out.println("V = "+ V);
    }
}
