/* ArrayList = a resizable array
 *              Elements can be added and removed after compilation phase
 *              store reference data types 
 */
import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hot dog");
        
        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }

        food.set(0, "sushi");
        food.remove(1);
        food.clear();

        
        for(String i : food){
        System.out.println(i);
        }
        
    }
    
}
