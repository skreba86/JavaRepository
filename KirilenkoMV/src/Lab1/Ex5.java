package lab1;

/**
 * Created by User on 28.04.2015.
 * <p/>
 * Добавить слово "рублей" в правильном падеже.
 */
public class Ex5 {
    public static void main(String[] args) {
        int number = 113;
        System.out.print(number + " ");
        int digit = number % 100;
        if (digit == 11 || digit == 12 || digit == 13 || digit == 14) {
            System.out.println("рублей");
        } else {
            switch (digit % 10) {
                case 1:
                    System.out.println("рубль");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("рубля");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0:
                    System.out.println("рублей");
                    break;
                default:
                    System.out.println("Exception!");
            }
        }
    }
}
