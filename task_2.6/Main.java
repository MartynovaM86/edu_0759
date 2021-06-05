/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число a: ");
            int a = scanner.nextInt();
            System.out.print("Введите число b: ");
            int b = scanner.nextInt();
            int c = a/b;
            int d = a%b;
            if(a%b == 0){
                System.out.println("Делится без остатка: " + c);
            }else if (a%b != 0) {
                System.out.println("Делится с остатком: " + d);
            }
            System.out.println("Для выхода введите exit, для продолжения нажмите enter");
            scanner.nextLine();
            String command = scanner.nextLine();
            if (command.equals("exit")) break;
        }
    }
}
