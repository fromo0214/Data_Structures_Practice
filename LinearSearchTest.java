import java.util.*;
/* linear search = Iterate through a collection one element at a time 
 *          runtime complexity: O(n)
 *          
 *          Disadvantages: 
 *          Slow for large data sets
 * 
 *          Advantages:
 *          Fast for searches of small to medium data sets 
 *          Does not need to be sorted
 *          Useful for data structures that do not have random access (Linked List)
 */

public class LinearSearchTest {
    public static void main(String[] args) {
        //linear search = Iterate through a collection one element at a time 
        
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5}; 

        int index = linearSearch(array, 1);
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
    

        if(index == -1){
            System.out.println("\nElement is not found in the array");
        }else{
        System.out.println("\nElement found at index: " + index);
        }
    }

    private static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }


}
