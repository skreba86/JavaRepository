package lab1;

/**
 * Created by User on 28.04.2015.
 * <p/>
 * Записать число в обратном порядке.
 */
public class Ex6 {
    public static void main(String[] args) {
        int number = 12345;
        int result = 0;
        while (number > 0) {
            int digit = number % 10;
            result = result * 10 + digit;
            number /= 10;
        }
        System.out.println(result);

    }
}
