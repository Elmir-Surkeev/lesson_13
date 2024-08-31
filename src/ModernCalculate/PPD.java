package ModernCalculate;

import java.util.Scanner;

public class PPD extends Figure{

    public void getSquare(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные длины");
        double length = scanner.nextDouble();
        System.out.println("Введите данные ширины");
        double width = scanner.nextDouble();
        System.out.println("Введите данные высоты");
        double heigth = scanner.nextDouble();

        double S = 2*((length*heigth)+(length*width) + (width*heigth));
        System.out.println("S = "+ S);
        double V = heigth*width*length;
        System.out.println("V = "+ V);
    }


    @Override
    public void checkingNegativeNumbers() {

    }
}
