import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList
{
    public static void main(String[] args) {
        
        String[] array = {"apple", "banana", "orange"};

        //  To convert array to ArrayList
        List<String> arrayList = new ArrayList<>(Arrays.asList(array));

        // Now print the ArrayList
        System.out.println("ArrayList: " + arrayList);
    }
}
