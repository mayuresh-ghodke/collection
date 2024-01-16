import java.util.*;

public class HashSetMain {
public static void main(String[] args)
{
    //HashSet does not use Indexes...
    HashSet<Integer> hs = new HashSet<Integer>(); //Initital capacity is 16

    //HashSet hs = new HashSet(100);//Here we, initialized HashSet capacity to 100. Still it 
    //has LoadFactor 0.75, to change it ;
    //HashSet hs = new HashSet(100, (float)0.95);

    hs.add(30);
    hs.add(40);
    hs.add(10);
    hs.add(5);

    System.out.println(hs.contains(5));

    HashSet<Integer> another = new HashSet<Integer>();
    another.add(100);

    another.addAll(hs);

    //Only two ways to iterate or read the hashset

    for(Object obj:another)
    {
        System.out.println("hey..."+another);
    }

    System.out.println();

    Iterator it = hs.iterator();

    while(it.hasNext())
    {
        System.out.println(it.next());
    }
    //To sort the hashset: We can't directly sort the hashset, we have to convert 
    //hashset object to the array list and then perform sorting operation.
    ArrayList al = new ArrayList<>(hs);

    Collections.sort(al);
    System.out.println("Sorted hashset using arralist: "+al);
}
}
