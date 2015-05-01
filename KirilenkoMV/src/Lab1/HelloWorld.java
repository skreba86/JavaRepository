package lab1;

/**
 * Created by User on 23.04.2015.
 *
 * Первое занятие.
 */
public class HelloWorld {
    public static void main(String[] args) {
        int number = 15;
        if (number % 15 == 0) {
            System.out.println(number * number * number);
        } else if (number % 3 == 0) {
            System.out.println(number * number);
        } else {
            System.out.println(number * number * number * number);
        }

    }

}
