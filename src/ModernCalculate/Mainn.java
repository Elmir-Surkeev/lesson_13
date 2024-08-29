package ModernCalculate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        start();
    }
    public static void doInception(Figure figure){
        figure.currentS();
        figure.currentV();
    }
    public static void start(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите числа если хотите найти площадь ППД=1, Сферы=2, Конус=3 и Цилиндра=4");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    doInception(new PPD(1, 1, 1, 1, 3.12));
                    break;
                case 2:
                    doInception(new Sphere(1, 1, 1, 1, 3.12));
                    break;
                case 3:
                    doInception(new Cone(1, 1, 1, 1, 3.12, 1));
                    break;
                case 4:
                    doInception(new Cylinder(1, 1, 1, 1, 3.12));
                    break;
                default:
                    return;
            }
        }catch (InputMismatchException e){
            System.out.println("Вы ввели неккоретные данные Введите только число 1-4");
            start();
        }
    }
}
