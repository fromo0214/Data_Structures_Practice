package Sorting_Algorithms;
/* bubble sort = pairs of adjacent elements are compared, and the elements swapped
                if they are not in order

                Quadratic time: O(n^2)
                small data set = okay-ish
                large data set = bad
 * 
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] array = {9,1,2,7,5,4,8,3,6};
        bubbleSort(array);
        for(int i : array){
            System.out.print(i);
        }
    }

    public static void bubbleSort(int[] array) {
        
        for(int i = 0; i < array.length - 1;i++){
            for(int j = 0; j > array.length - i - 1; j++){
                //if array[j] is greater than the number next to it then it 
                //switches with its adjacent element
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
