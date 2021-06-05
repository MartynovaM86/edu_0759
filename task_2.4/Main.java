/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Введите сумму вклада: ");
            double vklad = scanner.nextDouble();
            System.out.print("Введите процент: ");
            double procent = scanner.nextDouble();
            procent = procent/100;
            double result1 = (vklad * procent + vklad);
            System.out.println("Размер вклада за 1 год: " + result1);
            double result2 = (result1 * procent + result1);
            System.out.println("Размер вклада за 2 год: " + result2);
            double result3 = (result2 * procent + result2);
            System.out.println("Размер вклада за 3 год: " + result3);
            double result4 = (result3 * procent + result3);
            System.out.println("Размер вклада за 4 год: " + result4);
            double result5 = (result4 * procent + result4);
            System.out.println("Размер вклада за 5 год: " + result5);
        }
    }
}
