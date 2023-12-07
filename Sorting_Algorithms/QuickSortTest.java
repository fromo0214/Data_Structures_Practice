package Sorting_Algorithms;
import java.util.Random;
/* quick sort = moves smaller elements to the left of a pivot.
                recursively divide array in 2 partitions

    run-time complexity = Best case O(n log(n))
                        Average case O(n log(n))
                        Worse case (o(n^2)) if already sorted
    
    Space complexity = O(log(n)) due to recursion
 * 
 */
public class QuickSortTest {
    public static void main(String[] args) {
        Random rand = new Random();


        int [] randomArray = new int[10];

        for(int  i = 0; i < randomArray.length; i++){
            randomArray[i] = rand.nextInt(20);
            System.out.print(randomArray[i]+ " ");
        }
        System.out.println("");
        // int array[] = {8,2,4,7,1,3,9,6,5};

        quickSort(randomArray, 0, randomArray.length - 1);

        for(int i : randomArray){
            System.out.print(i+ " ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        //eventually it will stop dividing so you return it
        if(end <= start){
            return; //base case
        }
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);



    }
    private static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end - 1;j++){
            if(array[j] < pivot){
                i++;
                //basic variable swap 
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        //returning the location of the pivot
        return i;
    }

  
}
