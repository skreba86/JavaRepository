package lab20;

/*Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметры, например <p id=”p1”>, и замену их на простые теги абзацев <p>.
 */

public class Main {

    public static void main(String[] args) {
        RegularExpressions paragraph = new RegularExpressions();
        paragraph.replacingParagraphP("<p = sb,asd p> slsjdflbsjfl <p djbdnf,dn /p>");
    }
}