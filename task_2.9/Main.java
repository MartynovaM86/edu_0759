/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5};
        int proz = 5;
        for (int i = 0; i < 4; i++) {
            // proz == nums[i];
            if (proz == nums[i]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
