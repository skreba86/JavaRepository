package lab2;

/**
 * Задание 2
 * Продолжите приведенный пример, добавьте расчет и вывод суток и недель.
 */
public class HelloWorld {
    public static void main(String[] args) {
        int s = 1900000;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int d = h % 24;
        int day = (h - d) / 24;
        int w = day % 7;
        int week = (day - w) / 7;
        System.out.println(h + " часов " + min + " минут " + sec + " секунд " + day + " суток " + week + " недель");
    }
}






