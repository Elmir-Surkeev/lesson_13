package ModernCalculate;

import java.util.Scanner;

public class Sphere extends Figure{
    public void getSquare(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные радиуса");
        double radius = scanner.nextDouble();

        double S = (4*Math.PI)* (radius*2) ;
        System.out.println("S = "+ S);
        double V = (4*Math.PI) * (radius*3)/3 ;
        System.out.println("V = "+ V);
    }


    @Override
    public void checkingNegativeNumbers() {

    }

}
