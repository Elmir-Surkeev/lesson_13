package ModernCalculate;

import java.util.InputMismatchException;
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

        checkingNegativeNumbers(radius, heigth, obrazCone);

        try {
            double sWall = Math.PI*radius*obrazCone;
            double sOsnovanie = Math.PI*(radius*radius);
            double S = sWall+sOsnovanie;
            System.out.println("S = "+ S);

            double V = (Math.PI*(radius*radius)*heigth)/3;
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
