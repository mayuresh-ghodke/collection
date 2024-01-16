import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(3);
        set1.add(4);
        set1.add(13);
        set1.add(1);
        set1.add(17);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(17);
        set2.add(24);
        set2.add(25);
        set2.add(26);
        set2.add(27);

        // Union
        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union: " + unionSet);

        // Intersection
        HashSet<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection: " + intersectionSet);

        // Difference
        HashSet<Integer> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference: " + differenceSet);

        assert(set1.add(50));
        
    }
}
