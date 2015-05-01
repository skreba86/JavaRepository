package lab11;

/**
 * Задание 11
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class Lab11 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 100;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма первых " + n + " чисел, которые делятся на три равна: " + sum);
    }
}
