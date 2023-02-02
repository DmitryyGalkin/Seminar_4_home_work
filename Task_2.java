import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;



/* Создать очередь с помощью LinkedList и реализовать следующие методы:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
Вызвать полученные методы и убедиться в их работоспособности. */

public class Task_2 {
    public static void main(String[] args) {
        Queue<Integer> listDigit = new LinkedList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listDigit.add(random.nextInt(150));
        }
        System.out.println(listDigit);
        System.out.println(enqueue(listDigit));
        System.out.println("----------");
        System.out.println(listDigit);
        System.out.println(dequeue(listDigit));
        System.out.println("----------");
        System.out.println(listDigit);
        System.out.println("----------");
        System.out.println(first(listDigit));
        System.out.println(listDigit);
    }
    static Queue<Integer> enqueue(Queue<Integer> inpQueue){
        int movEl = inpQueue.remove();
        inpQueue.add(movEl);  
        return inpQueue;
    }
    static int dequeue(Queue<Integer> inpQueue){
        int firstEl = inpQueue.remove();
        return firstEl;
    }
    static int first(Queue<Integer> inpQueue){
        int firstEl = inpQueue.peek();
        return firstEl;
    }
}