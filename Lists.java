import java.util.Iterator;
import java.util.ArrayList;
public class Lists {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();

        list.add("Apple");
        list.add("Banana");

       // System.out.println(list);

        Iterator<String> s = list.iterator();

        for(int i = 0; i < list.size(); i++){
            System.out.println(s.next());
        }
        // System.out.println(s.next());
    }
    
}
