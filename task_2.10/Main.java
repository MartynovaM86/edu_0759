/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 4};
        for (int i = 0; i < 4; i++) {
            nums[i] == nums[i];
            System.out.println("YES");
            nums[i] != nums[i];
            System.out.println("NO");
            }
        }
    }