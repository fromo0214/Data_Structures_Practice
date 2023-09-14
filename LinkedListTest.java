import java.util.*;
/* LinkedLisst = stores Nodes in 2 parts (data + address)
                Nodes are in non-constructive memory locations
 *              Elements are linked using pointers 
 * 
 *                  Singly Linked List
 *      Node            Node            Node
 * [data | address]-->[data|address]-->[data|address]
 *                  
 *                  Doubly Linked List
 *          Node                        Node
 *  [address | data | address]<--->[address | data | address]
 * 
 * Advantages?
 * 1. Dynamic Data Structure (allocates needed memory while running)
 * 2. Insertion and Deletion of Nodes is easy. O(1)
 * 3. No/Low memory waste
 * 
 * Disadvantages?
 * 1. Greater memory usage (additional pointer)
 * 2. No random access of elements (no index [i])
 * 3. Accessing/searching elements is more time consuming. O(n)
 * 
 * Uses?
 * 1. implement stacks/queues
 * 2. gps navigation
 * 3. music playlist 
 */

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        //Stack methods
        // list.push("A");
        // list.push("B");
        // list.push("C");
        // list.push("D");
        // list.push("F");
        // list.pop();

        //Queue methods
        list.offer("A");
        list.offer("B");
        list.offer("C");
        list.offer("D");
        list.offer("F");
        // list.poll();

        list.add(4, "E");
        // list.remove("E");

        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        list.addFirst("0");
        list.addLast("G");

        String first = list.removeFirst();
        String last = list.removeLast();
        // System.out.println(list.indexOf("F"));
        System.out.println(list);
      
        System.out.println(first + last);
        
    }
}
