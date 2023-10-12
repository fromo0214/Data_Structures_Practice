import java.util.*;
/*Priority queue = A FIFO data structure that serves elements with the 
 * highest priorities first before elements with lower prioriry
 */
public class PriorityQueuesTest {
    public static void main(String[] args) {
        //We added a collections method in the comparator of the priority queue 
        // and the .reverseOrder() method reverses the order in which the queue displays
        // Collections.reverseOrder()
        // Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Double> queue = new PriorityQueue<>();

        //GPA's offered in random orders 
        queue.offer(2.0);
        queue.offer(4.0);
        queue.offer(3.0);
        queue.offer(3.75);
        queue.offer(1.5);

        //Grade marks offered in random orders
        // queue.offer("B");
        // queue.offer("A");
        // queue.offer("C");
        // queue.offer("F");

        //While our queue is not empty poll(remove) each element and display it 
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
