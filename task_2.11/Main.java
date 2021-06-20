/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 1, 6};
        int sum = 0;
        for (int i = 1; i < 5;  i++) {
        if (sum < 10) sum = nums[i];
    }
    System.out.println(sum);

    }
}
