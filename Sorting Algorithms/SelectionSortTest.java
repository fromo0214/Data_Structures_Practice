/* Selection sort = search thorugh an array and keep track of the minimum value 
                    during each iteration. At the end of each iteration, we swap
                    variables.

                    Quadratic time: O(n^2)
                    small data set = okay
                    large data set = BAD
 * 
 */
public class SelectionSortTest {
    public static void main(String[] args) {
        int array[] = {1,4,2,7,5,8,9,3,6};
        selectionSort(array);

        for(int i : array){
            System.out.print(i);
        }
    }

    public static void selectionSort(int[] array) {
        for(int i = 0; i < array.length - 1;i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        
    }
    
}
