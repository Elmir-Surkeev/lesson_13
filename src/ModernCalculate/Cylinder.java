package ModernCalculate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cylinder extends Figure{
    public void getSquare(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные радиуса");
        double radius = scanner.nextDouble();
        System.out.println("Введите данные высоты");
        double heigth = scanner.nextDouble();

        checkingNegativeNumbers(radius, heigth);

        try {
            double a = Math.PI* (radius+heigth);
            System.out.println("A = "+ a);
            double V = Math.PI*(radius*radius)*heigth;
            System.out.println("V = "+ V);
        }catch (InputMismatchException ime){
            System.out.println("Вы ввели неправильные символы пожалуйста введите только цифры");
            ime.getMessage();
        }catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            iae.getMessage();
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так! ");
        }
    }


    @Override
    public void checkingNegativeNumbers(double... numbers) {
        for (double number : numbers) {
            if (number <= 0) {
                throw new IllegalArgumentException("Все размеры должны быть положительными числами.");
            }
        }
    }

}
