package Sorting_Algorithms;

/* insertion sort = after comparing elements to the left, shift elements to the
                    right to make room to insert a value

                    Quadratic time O(n^2)
                    small data set = decent
                    large data set = BAD

                    Less steps than Bubble Sort
                    Best case is O(n) compared to Selection Sort O(n^2)
 * 
 */
public class InsertionSortTest {
    public static void main(String[] args) {
        int array[] = {6,1,7,4,2,9,8,5,3};

        insertionSort(array);

        for(int i : array){
            System.out.print(i + " ");
        }
     }

    public static void insertionSort(int[] array) {
        for(int i = 0;i < array.length; i++){
            int temp = array[i];
            // will keep track of what value we are comparing of whatever i is
            int j = i - 1;

            while(j >= 0 && array[j] > temp){
                //to shift an element to the right
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
    
}
