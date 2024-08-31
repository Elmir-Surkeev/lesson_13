package ModernCalculate;

import java.util.Scanner;

public class Cone extends Figure{

    public void getSquare(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные радиуса");
        double radius = scanner.nextDouble();
        System.out.println("Введите данные высоты");
        double heigth = scanner.nextDouble();
        System.out.println("Введите данные основы конуса");
        double obrazCone = scanner.nextDouble();

        double sWall = Math.PI*radius*obrazCone;
        double sOsnovanie = Math.PI*(radius*radius);
        double S = sWall+sOsnovanie;
        System.out.println("S = "+ S);

        double V = (Math.PI*(radius*radius)*heigth)/3;
        System.out.println("V = "+ V);
    }


    @Override
    public void checkingNegativeNumbers() {

    }
}
