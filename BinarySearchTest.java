import java.util.*;
/* binary search = Search algorithm that finds the position of a target value within
 *                  a sorted array.
 *                  Half of the array is elimanated during each "step"
 *                  Binary search does well with large data sets
 *                  
 *                  O(log n)
 */
public class BinarySearchTest {
public static void main(String[] args) {
    int array[] = new int[1000000];

    int target = 777777;

    for(int i = 0; i < array.length;i++){
        array[i] = i;

    }
    //Arrays class implements the .binarySearch() method for easy way
    // int index = Arrays.binarySearch(array, target);
    int index = binarySearch(array, target);

    if(index == -1){
        System.out.println("Target: " + target +  "is not found in the array.");
    }else{
    System.out.println("Element found at: " + index);
    }
  }

  
//   This is the manual method of doing a binary search method, we can also use the
//   method the Arrays class implements when we import it into our code (Line 19)
private static int binarySearch(int[] array, int target) {
    //low index
    int low = 0;
    //high index hence why we do -1 to get the end of the array
    int high = array.length - 1;

    while(low <= high){
        int middle = low + (high-low) / 2;
        int value = array[middle];

        System.out.println("Middle:" + value);

        if(value < target){
            low = middle + 1;
        }else if(value > target){
            high = middle - 1;
        }else{
            return middle; //target is found
        }
    }
    return -1; //target not found
}    
}
