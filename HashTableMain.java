import java.util.Hashtable;

public class HashTableMain {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(18, "Virat Kohli");
        ht.put(45,"Rohit Sharma");
        ht.put(07,"Dhoni");
        
        System.out.println(ht.get(45));
    }
}
