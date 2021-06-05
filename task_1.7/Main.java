/* Задача наполнить корабельный бассейн. Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
Эти размеры передаются запрашиваются у пользователя. Прграмма должена вывести на экран количество литров воды,
которое нужно для наполнения бассейна.
Пример:
Пользователь даёт числа 25, 5, 2.
Пример вывода:
250000 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println ("Введите размеры бассейна:");
        Scanner scan = new Scanner(System.in);
        System.out.println ("Длина:");
        int a = scan.nextInt();
        System.out.println ("Ширина:");
        int b = scan.nextInt();
        System.out.println ("Высота:");
        int c = scan.nextInt();
        int d = a*b*c;
        int E = d*1000;
        System.out.println ("Столько литров воды нужно, чтобы наполнить бассейн:");
        System.out.println (E);
    }
}
