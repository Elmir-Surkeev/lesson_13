package UserLogicRegistration;
import java.util.InputMismatchException;
import java.util.OptionalInt;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter name");
            String name = scanner.nextLine();
            if (containsNumbers(name)){
                throw new IllegalArgumentException("Name must be not numbers");
            }
            System.out.println("Enter surname");
            String surName = scanner.nextLine();
            if (containsNumbers(name)){
                throw new IllegalArgumentException("Surname must be not numbers");
            }
            System.out.println("Enter how your year you born");
            int age = Integer.parseInt(scanner.nextLine());
            if (age > 2024+1){
                throw new IllegalArgumentException("Are you a doctor Strange");
            }
            System.out.println("Enter startWork year");
            int ageExperiance = Integer.parseInt(scanner.nextLine());
            if (ageExperiance < 2024){
                throw  new IllegalArgumentException("start work year dont be in Future");
            }
            if (ageExperiance-age < 18){
                throw new IllegalArgumentException("When you start worked, you was be a child");
            }
        }catch (InputMismatchException | NumberFormatException e){
            System.out.println("your enter mistake numbers");
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
        }finally {
            scanner.close();
        }
    }
    private static boolean containsNumbers(String input) {
        return input.matches(".*\\d.*");
    }

}