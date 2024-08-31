package ModernCalculate;

import java.util.InputMismatchException;
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

        checkingNegativeNumbers(length, width, heigth);

        try {
            if (length>0 && heigth>0&&width>0){}
            double S = 2*((length*heigth)+(length*width) + (width*heigth));
            System.out.println("S = "+ S);
            double V = heigth*width*length;
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
