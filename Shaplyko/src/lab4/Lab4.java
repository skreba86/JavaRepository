package lab4;

/**
 * Задание 4
 * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью закрыть круглой картонкой радиусом
 */
public class Lab4 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int r = 6;
        double x = a * a + b * b;
        double y = Math.sqrt(x);
        if (r > y) {
            System.out.println("Можно закрыть");
        } else {
            System.out.println("Нельзя");
        }
    }
}
