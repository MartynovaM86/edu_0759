/*
Задание: Дано число, например 31. Проверьте, что это число не делится ни на одно другое число кроме себя самого и единицы. То есть в нашем случае нужно проверить, что число 31 не делится на все числа от 2 до 30. Если число не делится - выведите 'false', а если делится - выведите 'true'.
*/
public class Main {
    public static void main(java.lang.String[] arg) {
         int a = 31;
        int b= 0 ;
        int c = 1;
        while (b <= a){
            if(a/c == 0)
                b++;
            c++;
        }
        if (b == 2)
            System.out.println(a  +  "- false");
        else
            System.out.println(a  + "- true");
    }
}
