
import java.util.HashMap;
import java.util.*;

public class HashMapMain {
    public static void main(String[] args)
    {
        //HashMap hm = new HashMap<>();

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "Mayuresh");
        hm.put(102,"Vishal");
        hm.put(103, "Gaurav");
        hm.put(104, "Aniket");

        System.out.println("Size: "+hm.size());
        System.out.println("Original data: "+hm);
        System.out.println("Value at index 102: "+hm.get(102));
        System.out.println("entryset(): "+hm.entrySet());
        System.out.println("keyset(): "+hm.keySet());
        System.out.println("values(): "+hm.values());

        System.out.println("Entry interface methods:-");
       
        for(int i: hm.keySet())//Type mismatch: cannot convert from element type Object
                                // it gets, if we can't explicitely give type while object creating.
        {
            System.out.println(i);
        }

        for(String str: hm.values())//Type mismatch: cannot convert from element type Object
                                // it gets, if we can't explicitely give type while object creating.
        {
            System.out.println(str);
        }

        System.out.println("Keys"+"    "+"Values");
        for(Object obj: hm.keySet())
        {
            System.out.println(obj+"    "+hm.get(obj));
        }

        int count =0;
        // Entry methods: 
        for(Map.Entry entry: hm.entrySet())
        {
            count++;
            System.out.println(entry);
        }
        System.out.println("Count is : "+count);


        System.out.println("Using Iterator():- ");
        Set set = hm.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
