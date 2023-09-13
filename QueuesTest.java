import java.util.Queue;
import java.util.LinkedList;

public class QueuesTest {
    /*Queue = FIFO data structure. First-In First-Out (ex. line of people)
     * A collection designed for holding elements prior to processing linear
     * data structure
       add = enqueue, offer()
       remove = enqueue. poll()
     */ 

     //queue interface extends the collection class so we are able to use those methods 
     //they provide
    public static void main(String[] args) {
       Queue<String> queue = new LinkedList<String>();  

        //checks if the queue is empty 
       System.out.println(queue.isEmpty());
       //line of customers, Karen is at the head and Harold is at the tail
       queue.offer("Karen");
       queue.offer("Chad");
       queue.offer("Steve");
       queue.offer("Harold");
        
       //checks if there is an object in the queue
       System.out.println(queue.contains("Chad"));
        //prints size of queue
       System.out.println(queue.size());
       //this line prints out the head of the queue
    //    System.out.println(queue.peek());
        //poll removes items from the start of the line 
        queue.poll();
        queue.poll();
        queue.poll();
        

    System.out.println(queue);
    



    }
}
/* Where are queues useful?
 * 1. Keyboard buffer (letters should appear on the screen in the order they're pressed)
 * 2. Printer Queue (print jobs should be completed in order)
 * 3. Used in LinkedLists, PriorityQueues, Breadth-first search 
 */