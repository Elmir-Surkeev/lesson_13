package ModernCalculate;

import java.util.Scanner;

public class Cylinder extends Figure{
    public void getSquare(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные радиуса");
        double radius = scanner.nextDouble();
        System.out.println("Введите данные высоты");
        double heigth = scanner.nextDouble();

        double a = Math.PI* (radius+heigth);
        System.out.println("A = "+ a);
        double V = Math.PI*(radius*radius)*heigth;
        System.out.println("V = "+ V);
    }


    @Override
    public void checkingNegativeNumbers() {

    }

}
