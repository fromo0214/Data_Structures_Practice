import java.util.HashMap;
// HashMap implements the map Interface (need import)
// HashMap is similar to ArrayList, but with key-value partitions
// stores objects, need to use Encapsulation
// ex. (name,email),(username,userID),(country,capital)

public class HashMapTest {
    public static void main(String[] args) {
        
        HashMap<String,String> countries = new HashMap<String,String>();
        HashMap<String,Integer> users = new HashMap<String,Integer>();

        users.put("fromo", 0214);

        //add a key and a value
        countries.put("USA", "Washington DC");
        countries.put("India", "Neew Delhi");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");

        //this removes the whole pair out of the map even though we did not remove
        //Washington DC
        // countries.remove("USA");
        
        //this just prints the Value (V)
        // System.out.println(countries.get("Russia"));

        //clears the hashmap pairs
        // countries.clear();
        
        // .size() displays the size of the Hashmap
        // System.out.println(countries.size());
        
        //this replaces the value of the keys
        // countries.replace("USA", "Detroit");

        //this prints out the newly replaced value, detroit is the new capital of
        //the US
        // System.out.println(countries.get("USA"));

        //The contains method is boolean type and returns true or false if
        //the K/V you are looking for exists
        // System.out.println(countries.containsKey("England"));
        // System.out.println(countries.containsValue("England"));

        

        for(String i : countries.keySet()){
            System.out.print(i + "\t" +"=    ");
            System.out.println(countries.get(i));
        }

    }
}
