package lab1;

/**
 * Created by User on 28.04.2015.
 * <p/>
 * Дано любое натуральное n. Верно ли, что все цифры разные?
 */
public class Ex7 {
    public static void main(String[] args) {
        int number = 12345678;
        boolean flag = true;
        while (number > 0) {
            int digit = number % 10;
            int subnumber = number / 10;
            number /= 10;
            while (subnumber > 0) {
                if (subnumber % 10 == digit) {
                    flag = false;
                }
                subnumber /= 10;
            }
        }
        System.out.println(flag);
    }
}
