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
            System.out.println("Введите числа если хотите найти площадь ППД=1, Сферы=2, Цилиндр=3 и Конус=4");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    try {
                        System.out.println("Enter a length for PPD");
                        double length = scanner.nextDouble();
                        if (length <= 0) {
                            System.out.println("You entered incorrect data. Length must be positive.");
                            break;
                        }

                        System.out.println("Enter a height for PPD");
                        double height = scanner.nextDouble();
                        if (height <= 0) {
                            System.out.println("You entered incorrect data. Height must be positive.");
                            break;
                        }

                        System.out.println("Enter a width for PPD");
                        double width = scanner.nextDouble();
                        if (width <= 0) {
                            System.out.println("You entered incorrect data. Width must be positive.");
                            break;
                        }

                        // Если все данные корректны
                        doInception(new PPD(length, width, height, 0, 3.12));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter numeric values.");
                        scanner.nextLine();
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Enter Radius");
                        double radius = scanner.nextDouble();
                        if (radius <= 0) {
                            System.out.println("You entered incorrect data. Length must be positive.");
                            break;
                        }
                        doInception(new Sphere(0, 0, 0, radius, 3.12));
                    }catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter numeric values.");
                        scanner.nextLine();
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Enter Height");
                        double heighttt = scanner.nextDouble();
                        if (heighttt <= 0 ) {
                            System.out.println("You entered incorrect data. Length must be positive.");
                            break;
                        }
                        System.out.println("Enter a radius for PPD");
                        double radiusss = scanner.nextDouble();
                        if(radiusss <= 0){
                            System.out.println("You entered incorrect data. Length must be positive.");
                            break;
                        }
                        doInception(new Sphere(0, 0, heighttt, radiusss, 3.12));
                    }catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter numeric values.");
                        scanner.nextLine();
                    }
                    break;


                case 4:
                    try {
                        System.out.println("Enter a height for Cone");
                        double heightt = scanner.nextDouble();
                        if (heightt <= 0) {
                            System.out.println("You entered incorrect data. Height must be positive.");
                            break;
                        }
                        System.out.println("Enter a radius for Cone");
                        double radiuss = scanner.nextDouble();
                        if (radiuss <= 0) {
                            System.out.println("You entered incorrect data. Radius must be positive.");
                            break;
                        }
                        System.out.println("Enter a obrazCone for Cone");
                        double obrazCone = scanner.nextDouble();
                        if (obrazCone <= 0) {
                            System.out.println("You entered incorrect data. Slant height must be positive.");
                            break;
                        }
                        doInception(new Cone(0, 0, heightt, radiuss, 3.12, obrazCone));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter numeric values.");
                        scanner.nextLine();
                    }
                default:
                    System.out.println("Неверный выбор. Введите число от 1 до 4.");
                    start();
                    return;

            }
        }catch (InputMismatchException e){
            System.out.println("Вы ввели некорректные данные Введите только число 1-4");
            scanner.nextLine();
            start();
        }
    }
}
