import java.util.*;
public class ArraySortUsingArrayList {
    public static void main(String[] args)
    {
        int[] arr = {10,30,5,1,2,0,3,9};

        List<Integer> al = new ArrayList(Arrays.asList(arr));

        Collections.sort(al);
        
        Iterator it = al.iterator();
        while(it.hasNext())

        {
            System.out.println("Sorted Array Data: "+it.next());
        }

    }
}
