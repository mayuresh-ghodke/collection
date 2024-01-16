import java.util.*;

public class LinkedHashSetMain
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>();
        lhs1.add(200);

        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);

        Iterator iterator = lhs.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());//Here, in LinkedHashSet insertion order is preserved.
        }

        System.out.println("Hashcode 1: "+lhs.hashCode());
        System.out.println("Hashcode 2: "+lhs1.hashCode());


    }    
}
