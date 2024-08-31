package ModernCalculate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        System.out.println("Нажмите кнопку: 1 - параллелепипед, 2 - сфера, 3 - цилиндр, 4 - Конус");
        Scanner sc = new Scanner(System.in);
        try {
            int figureChoice = sc.nextInt();
            switch (figureChoice) {
                case 1:
                    System.out.println("Вы выбрали параллелепипед ");
                    Figure parallelepiped = new PPD();
                    parallelepiped.getSquare();
                    break;
                case 2:
                    System.out.println("Вы выбрали сферу ");
                    Figure sphere = new Sphere();
                    sphere.getSquare();
                    break;
                case 3:
                    System.out.println("Вы выбрали цилиндр ");
                    Figure cylinder = new Cylinder();
                    cylinder.getSquare();
                    break;
                case 4:
                    System.out.println("Вы выбрали конус ");
                    Figure cone = new Cone();
                    cone.getSquare();
                    break;
                default:
                    System.out.println("Выбор неверной фигуры для расчета площади и объёма");
                    break;
            }
        } catch (InputMismatchException ime) {
            System.out.println("Вы ввели нечисловые символы. Пожалуйста введите числа!");
            ime.getMessage();
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            iae.getMessage();
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так! ");
        }
    }
}
