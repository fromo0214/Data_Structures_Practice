import java.util.*;
/*
 * 
 */
public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);
        // System.out.println(dynamicArray.capacity);
        
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        dynamicArray.delete("D");
        dynamicArray.delete("E");
        // dynamicArray.insert(0, "X");
        // dynamicArray.delete("A");
        // System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: "+ dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());
    }



}
