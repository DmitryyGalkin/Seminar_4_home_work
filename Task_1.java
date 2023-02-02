import java.util.LinkedList;
import java.util.Random;

/* Создать LinkedList целых чисел (заполнить случайными числами).
Реализуйте метод, который вернет “перевернутый” список. */

/**
 * Task_1
 */
public class Task_1 {

    public static void main(String[] args) {
        LinkedList<Integer> listDigit = new LinkedList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listDigit.add(random.nextInt(150));
        }
        System.out.println(listDigit);
        System.out.println(reverseLinkedList(listDigit));

    }

    static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> inpLinList) {
        LinkedList<Integer> revList = new LinkedList<Integer>();

        for (int i = inpLinList.size() - 1; i >= 0; i--) {

            revList.add(inpLinList.get(i));

        }

        return revList;
    }
}